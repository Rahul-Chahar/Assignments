package Inheritance_Polymorphism_Abstract_Interface_Lambda.College_Fee_Abstract;

class DayScholar extends Student {
    private int busNumber;
    private float distance;

    public DayScholar(int studentId, String studentName, String department, String gender, String category, double collegeFee, int busNumber, float distance) {
        super(studentId, studentName, department, gender, category, collegeFee);
        this.busNumber = busNumber;
        this.distance = distance;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    @Override
    public double calculateTotalFee() {
        double busFee;
        if (distance > 30 && distance <= 40) {
            busFee = 28000;
        } else if (distance > 20 && distance <= 30) {
            busFee = 20000;
        } else if (distance > 10 && distance <= 20) {
            busFee = 12000;
        } else {
            busFee = 6000;
        }

        return collegeFee + busFee;
    }
}

