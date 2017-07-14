package beanIO;

import org.beanio.annotation.Field;
import org.beanio.annotation.Record;

@Record(name="vcase", minOccurs=0)
public class Case
{
	@Field(length=10)
    private String codePolFormatn;
	@Field(length=10)
    private String polCaseNo;
	@Field(length=2)
    private String codeCrt;
	@Field(length=8)
    private String hearingDate;
	@Field(length=40)
    private String familyName;
	@Field(length=40)
    private String givenName;
	@Field(length=20)
    private String middleName;
	@Field(length=10)
    private String codePolUnit;
	@Field(length=4)
    private String prosecDept;
    
    public String getCodePolFormatn() {
		return codePolFormatn;
	}

	public void setCodePolFormatn(String codePolFormatn) {
		this.codePolFormatn = codePolFormatn;
	}

	public String getPolCaseNo() {
		return polCaseNo;
	}

	public void setPolCaseNo(String polCaseNo) {
		this.polCaseNo = polCaseNo;
	}

	public String getCodeCrt() {
		return codeCrt;
	}

	public void setCodeCrt(String codeCrt) {
		this.codeCrt = codeCrt;
	}

	public String getHearingDate() {
		return hearingDate;
	}

	public void setHearingDate(String hearingDate) {
		this.hearingDate = hearingDate;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getCodePolUnit() {
		return codePolUnit;
	}

	public void setCodePolUnit(String codePolUnit) {
		this.codePolUnit = codePolUnit;
	}

	public String getProsecDept() {
		return prosecDept;
	}

	public void setProsecDept(String prosecDept) {
		this.prosecDept = prosecDept;
	}


	@Override
    public String toString()
    {
        return "Case [codePolFormatn=" + codePolFormatn + ", polCaseNo=" + polCaseNo + ", codeCrt=" + codeCrt + 
        		", hearingDate=" + hearingDate + ", familyName=" + familyName + ", givenName=" + givenName + 
        		", middleName=" + middleName +" , codePolUnit=" + codePolUnit + ", prosecDept=" + prosecDept + "]";
    }
    
}