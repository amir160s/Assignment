public class Professor extends Employee {
    private String subjectOfExpertise;

    public void setSubjectOfExpertise(String subjectOfExpertise) {
        this.subjectOfExpertise = subjectOfExpertise;
    }

    public String getSubjectOfExpertise() {
        return subjectOfExpertise;
    }

    @Override
    public String toString() {
        return super.toString()+"Subject Of Expertise: "+subjectOfExpertise;
    }


}
