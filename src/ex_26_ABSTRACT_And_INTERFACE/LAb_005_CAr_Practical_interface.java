package ex_26_ABSTRACT_And_INTERFACE;

public class LAb_005_CAr_Practical_interface {
    public static void main(String[] args) {
        car1 audi = new car1();
        audi.Drive();
    }
}


class car1 implements Engine1, Bracks, light {

    void Drive() {
        startEngine();
        applyBreak();
        ReportGenerateBracks();
        stopEngine();
        ReportGenerateEngine1();
        HeadLight();
        ReportGenerateHeadLight();


    }


    @Override
    public void applyBreak() {
        System.out.println("applyBreak");

    }

    @Override
    public void ReportGenerateBracks() {
        System.out.println("ReportGenerateBracks");
    }

    @Override
    public void startEngine() {
        System.out.println("startEngine");

    }

    @Override
    public void stopEngine() {

        System.out.println("stopEngine");
    }

    @Override
    public void ReportGenerateEngine1() {
        System.out.println("ReportGenerateEngine1");


    }

    @Override
    public void HeadLight() {
        System.out.println("HeadLight");
    }

    @Override
    public void ReportGenerateHeadLight() {
        System.out.println("ReportGenerateHeadLight1");
    }
}


interface Bracks {
    void applyBreak();

    default void ReportGenerateBracks() {
        System.out.println("Default ReportGenerate for Bracks");
    }
}

interface Engine1 {
    void startEngine();

    void stopEngine();

    default void ReportGenerateEngine1() {
        System.out.println("Default ReportGenerate for Engine");
    }
}

interface light{
    void HeadLight();
    default void ReportGenerateHeadLight(){
        System.out.println("ReportGenerateHeadLight");
    }
}


