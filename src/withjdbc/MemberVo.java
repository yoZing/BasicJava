package withjdbc;

// DTO(Data Transfer Object) = VO(Value Object)
// Model, Item, Bean(일반적으로 스프링에서 객체를 가리킴)
// iBatis(myBatis) vs Hibernate(JPA)
public class MemberVo {
	String memId;
	String memName;;
	String memRegNo;
	String memBir;
	String memZip;
	String memAdd;
	String memHomeTel;
	String memComTel;
	String memHp;
	String memMail;
	String memJob;
	String memLike;
	String memMemorial;
	String memMemorialDay;
	String memMileage;
	String memDelete;
	
	public MemberVo(String memId, String memName, String memMail) {
		super();
		this.memId = memId;
		this.memName = memName;
		this.memMail = memMail;
	}
	
	public MemberVo(String memId, String memName, String memRegNo, String memBir, String memZip, String memAdd,
			String memHomeTel, String memComTel, String memHp, String memMail, String memJob, String memLike,
			String memMemorial, String memMemorialDay, String memMileage, String memDelete) {
		super();
		this.memId = memId;
		this.memName = memName;
		this.memRegNo = memRegNo;
		this.memBir = memBir;
		this.memZip = memZip;
		this.memAdd = memAdd;
		this.memHomeTel = memHomeTel;
		this.memComTel = memComTel;
		this.memHp = memHp;
		this.memMail = memMail;
		this.memJob = memJob;
		this.memLike = memLike;
		this.memMemorial = memMemorial;
		this.memMemorialDay = memMemorialDay;
		this.memMileage = memMileage;
		this.memDelete = memDelete;
	}
	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	
	public String getMemRegNo() {
		return memRegNo;
	}
	public void setMemRegNo(String memRegNo) {
		this.memRegNo = memRegNo;
	}
	public String getMemBir() {
		return memBir;
	}
	public void setMemBir(String memBir) {
		this.memBir = memBir;
	}
	public String getMemZip() {
		return memZip;
	}
	public void setMemZip(String memZip) {
		this.memZip = memZip;
	}
	public String getMemAdd() {
		return memAdd;
	}
	public void setMemAdd(String memAdd) {
		this.memAdd = memAdd;
	}
	public String getMemHomeTel() {
		return memHomeTel;
	}
	public void setMemHomeTel(String memHomeTel) {
		this.memHomeTel = memHomeTel;
	}
	public String getMemComTel() {
		return memComTel;
	}
	public void setMemComTel(String memComTel) {
		this.memComTel = memComTel;
	}
	public String getMemHp() {
		return memHp;
	}
	public void setMemHp(String memHp) {
		this.memHp = memHp;
	}
	public String getMemMail() {
		return memMail;
	}
	public void setMemMail(String memMail) {
		this.memMail = memMail;
	}
	public String getMemJob() {
		return memJob;
	}
	public void setMemJob(String memJob) {
		this.memJob = memJob;
	}
	public String getMemLike() {
		return memLike;
	}
	public void setMemLike(String memLike) {
		this.memLike = memLike;
	}
	public String getMemMemorial() {
		return memMemorial;
	}
	public void setMemMemorial(String memMemorial) {
		this.memMemorial = memMemorial;
	}
	public String getMemMemorialDay() {
		return memMemorialDay;
	}
	public void setMemMemorialDay(String memMemorialDay) {
		this.memMemorialDay = memMemorialDay;
	}
	public String getMemMileage() {
		return memMileage;
	}
	public void setMemMileage(String memMileage) {
		this.memMileage = memMileage;
	}
	public String getMemDelete() {
		return memDelete;
	}
	public void setMemDelete(String memDelete) {
		this.memDelete = memDelete;
	}
	
	@Override
	public String toString() {
		return "MemberVo [memId=" + memId + ", memName=" + memName + ", memRegNo=" + memRegNo + ", memBir=" + memBir
				+ ", memZip=" + memZip + ", memAdd=" + memAdd + ", memHomeTel=" + memHomeTel + ", memComTel="
				+ memComTel + ", memHp=" + memHp + ", memMail=" + memMail + ", memJob=" + memJob + ", memLike="
				+ memLike + ", memMemorial=" + memMemorial + ", memMemorialDay=" + memMemorialDay + ", memMileage="
				+ memMileage + ", memDelete=" + memDelete + "]";
	}
}
