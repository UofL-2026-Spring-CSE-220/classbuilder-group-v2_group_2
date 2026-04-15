package edu.coolschool.utilities;

import edu.coolschool.utilities.dateutils.DateRecord;

public record PersonInfo(
        String firstName,
        String middleName,
        String lastName,
        DateRecord dateOfBirth,

        CountriesEnum countryOfResidence,
        CountriesEnum countryOfBirth
) {
        public PersonInfo {
            if (firstName == null || firstName.isBlank()) {
                throw new IllegalArgumentException("meaningless hard coded extremely bad error message");
            }
            if (lastName == null || lastName.isBlank()) {
                throw new IllegalArgumentException("meaningless hard coded extremely bad error message");
            }

            if (countryOfResidence == null) {
                throw new IllegalArgumentException("meaningless hard coded extremely bad error message");
            }
            if (countryOfBirth == null) {
                throw new IllegalArgumentException("meaningless hard coded extremely bad error message");
            }
        }


        public  static class Builder{
            private  String firstName;
            private  String middleName;
            private  String lastName;
            private DateRecord dateOfBirth;

            private CountriesEnum countryOfResidence;
            private CountriesEnum countryOfBirth;

            public Builder setFirstName(String firstName) {
                this.firstName = firstName;
                return this;
            }
            public Builder setMiddleName(String middleName) {
                this.middleName = middleName;
                return this;
            }
            public Builder setLastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            public Builder setCountryOfResidence(CountriesEnum countryOfResidence) {
                this.countryOfResidence = countryOfResidence;
                return this;
            }
            public Builder setCountryOfBirth(CountriesEnum countryOfBirth) {
                this.countryOfBirth = countryOfBirth;
                return this;
            }

            public Builder setDateOfBirth(DateRecord date) {
                this.dateOfBirth = date;
                return this;

            }


            public PersonInfo build(){
                return new PersonInfo(firstName,middleName,lastName,dateOfBirth,countryOfResidence,countryOfBirth);
            }


    }


        public String toString(int tab_level) {
            StringBuilder sb = new StringBuilder();
            String indent = "\t".repeat(tab_level);



            sb.append(indent).append("First Name: ").append(this.firstName).append("\n");
            sb.append(indent).append("Middle Name: ").append(this.middleName).append("\n");
            sb.append(indent).append("Last Name: ").append(this.lastName).append("\n");
            sb.append(indent).append("Date of Birth: ").append( String.format("%02d/%02d/%04d",  dateOfBirth.monthInteger(),dateOfBirth.dayInteger() ,dateOfBirth.yearInteger())).append("\n");
            sb.append(indent).append("Country of Residence: ").append(this.countryOfResidence).append("\n");
            sb.append(indent).append("Country of Birth: ").append(this.countryOfBirth).append("\n");

            return sb.toString();


        }
        @Override
        public String toString(){
            return toString(0);
        }


        public static void main(String[] args) {
            DateRecord dob = new DateRecord(15, 3, 2024);
            PersonInfo person = new PersonInfo.Builder()
                    .setFirstName("John")
                    .setMiddleName("Q")
                    .setLastName("Public")
                    .setDateOfBirth(dob)
                    .setCountryOfResidence(CountriesEnum.US)
                    .setCountryOfBirth(CountriesEnum.US)
                    .build();
            System.out.println(person.toString());
        }




}
