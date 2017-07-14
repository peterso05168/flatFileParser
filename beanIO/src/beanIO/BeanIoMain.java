package beanIO;
 
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.beanio.BeanReader;
import org.beanio.StreamFactory;
import org.beanio.builder.FieldBuilder;
import org.beanio.builder.FixedLengthParserBuilder;
import org.beanio.builder.RecordBuilder;
import org.beanio.builder.StreamBuilder;
 
public class BeanIoMain<T>
{  
	private Class<T> clazz;

	public BeanIoMain(Class<T> clazz) {
		this.clazz = clazz;
	}
	
    public List<T> readCSVFileUsingBeanIo()
    {
    	StreamFactory factory = StreamFactory.newInstance();
        UUID streamName = UUID.randomUUID();
        StreamBuilder builder = new StreamBuilder(streamName.toString())
            .format("fixedlength")
            .parser(new FixedLengthParserBuilder())
            .addRecord(this.clazz);

        factory.define(builder);

        InputStream in = this.getClass().getResourceAsStream("/data/case20150821.dat");
        BeanReader reader = factory.createReader(streamName.toString(), new InputStreamReader(in));
        Object record = null;
        List<T> objs = new ArrayList<T>();
        
        while ((record = reader.read()) != null) {           
            T obj = (T) record;
            objs.add(obj);            
        }
	        
        System.out.println(objs);
		return objs;
    }
    
    public static void main(String[] args)
    {
        List<Case> obj = new BeanIoMain(Case.class).readCSVFileUsingBeanIo();
    }
}