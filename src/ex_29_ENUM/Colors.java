package ex_29_ENUM;

public enum Colors {

    Red("#ff0000"),
    Green("#11ff70"),
    Blue("#7011ff"),
    Yello("#ffe966");

    private String HexCode;


    Colors(String hexCode) {
        this.HexCode = hexCode;
    }

    public String getHexCode() {
        return HexCode;
    }
}