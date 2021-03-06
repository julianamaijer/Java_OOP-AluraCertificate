public class Officer extends Employee implements Enabled{

    private UtilEnabled utilEnabled;

    public Officer(){
        this.utilEnabled = new UtilEnabled();
    }

    @Override
    public double getBonus() {
        return 50;
    }

    public boolean enable(int password) {
        return this.utilEnabled.enable(password);

    }

    public void setPassword(int password) {
        this.utilEnabled.enable(password);
    }

}
