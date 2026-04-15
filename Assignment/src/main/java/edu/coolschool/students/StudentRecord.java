package edu.coolschool.students;

import edu.coolschool.utilities.ErrorStrings;
import edu.coolschool.utilities.PersonInfo;
import edu.coolschool.utilities.dateutils.DateRecord;

public record StudentRecord(
       PersonInfo studentInfo,
       String studentID,
     PersonInfo fatherInfo,
        PersonInfo motherInfo,
      DateRecord enrollmentDate


) {

    public StudentRecord {

        if (studentID == null || studentID.isBlank() || studentID.length() != 9) {
            throw new IllegalArgumentException("studentID cannot be null or blank");
        }
        if (enrollmentDate == null ) {
            throw new IllegalArgumentException("enrollmentDate cannot be null or blank");
        }
        if(studentInfo == null){
            throw new IllegalArgumentException("studentInfo cannot be null");
        }

    }

    public String toString() {
        return toString(0);
    }

    public String toString(int tabLevel) {
        String intender = "\t".repeat(tabLevel+2);
        String extender = "\t".repeat(tabLevel);
        StringBuilder sb = new StringBuilder();
         sb.append(extender).append("Student ID: ").append(studentID).append("\n");
         sb.append("\t".repeat(tabLevel+1)).append("Enrollment Date: ").append(enrollmentDate).append("\n");
        sb.append("\t".repeat(tabLevel+1)).append("Student Information:").append("\n");
        sb.append(intender).append("First Name: ").append(studentInfo.firstName()).append("\n");
        sb.append(intender).append("Last Name: ").append(studentInfo.lastName()).append("\n");
        sb.append(intender).append("Date of Birth: ").append(studentInfo.dateOfBirth()).append("\n");
        sb.append(intender).append("Country of Residence: ").append(studentInfo.countryOfResidence()).append("\n");
        sb.append(intender).append("Country of Birth: ").append(studentInfo.countryOfBirth()).append("\n\n");

        if (fatherInfo != null) {
            sb.append("\t".repeat(tabLevel + 1)).append("Father Information:").append("\n");
            sb.append(intender).append("First Name: ").append(fatherInfo.firstName()).append("\n");
            sb.append(intender).append("Last Name: ").append(fatherInfo.lastName()).append("\n");
            sb.append(intender).append("Date of Birth: ").append(fatherInfo.dateOfBirth()).append("\n");
            sb.append(intender).append("Country of Residence: ").append(studentInfo.countryOfResidence()).append("\n");
            sb.append(intender).append("Country of Birth: ").append(studentInfo.countryOfBirth()).append("\n\n");
        }

        if (motherInfo != null) {
            sb.append("\t".repeat(tabLevel + 1)).append("Mother Information:").append("\n");
            sb.append(intender).append("First Name: ").append(motherInfo.firstName()).append("\n");
            sb.append(intender).append("Last Name: ").append(motherInfo.lastName()).append("\n");
            sb.append(intender).append("Date of Birth: ").append(motherInfo.dateOfBirth()).append("\n");
            sb.append(intender).append("Country of Residence: ").append(motherInfo.countryOfResidence()).append("\n");
            sb.append(intender).append("Country of Birth: ").append(motherInfo.countryOfBirth()).append("\n\n");

        }






        return sb.toString();
    }


    //class builder

    public  static  class Builder{
        private PersonInfo studentInfo;
        private String studentID;
        private PersonInfo fatherInfo;
        private PersonInfo motherInfo;
        private DateRecord enrollmentDate;

        public Builder setStudentInfo(PersonInfo studentInfo) {
            this.studentInfo = studentInfo;
            return this;
        }
        public Builder setStudentID(String studentID) {
            this.studentID = studentID;
            return this;
        }
        public Builder setFatherInfo(PersonInfo fatherInfo) {
            this.fatherInfo = fatherInfo;
            return this;
        }
        public Builder setMotherInfo(PersonInfo motherInfo) {
            this.motherInfo = motherInfo;
            return this;
        }
        public Builder setEnrollmentDate(DateRecord enrollmentDate) {
            this.enrollmentDate = enrollmentDate;
            return this;
        }
        public StudentRecord build() {
            return new StudentRecord(studentInfo,studentID,fatherInfo,motherInfo,enrollmentDate);
        }
    }

}

