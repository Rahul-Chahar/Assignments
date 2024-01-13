package Inheritance_Polymorphism_Abstract_Interface_Lambda.Endowment_Plan_Inheritance;

class EducationalEndowment extends Endowment {
    private String educationalInstitution;
    private String educationalDivision;

    public EducationalEndowment (String endowmentId, String holderName, String endowmentType, String registrationDate,
                                 String educationalInstitution, String educationalDivision) {
        super(endowmentId, holderName, endowmentType, registrationDate);
        this.educationalInstitution = educationalInstitution;
        this.educationalDivision = educationalDivision;
    }

    @Override
    public double calculateEndowment () {
        String divisionLowerCase = educationalDivision.toLowerCase();
        switch (divisionLowerCase) {
            case "school":
                return 30000.0;
            case "undergraduate":
                return 60000.0;
            case "postgraduate":
                return 90000.0;
            default:
                return 0.0;
        }
    }

    // Getters and setters for attributes
    public String getEducationalInstitution () {
        return educationalInstitution;
    }

    public void setEducationalInstitution (String educationalInstitution) {
        this.educationalInstitution = educationalInstitution;
    }

    public String getEducationalDivision () {
        return educationalDivision;
    }

    public void setEducationalDivision (String educationalDivision) {
        this.educationalDivision = educationalDivision;
    }
}

