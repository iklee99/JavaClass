public class BClass {
    private int x;
    private String str;

    public BClass(int x, String str) {
        this.x = x;
        this.str = new String(str);
    }

    public int getX() {
        return x;
    }

    public String getStr() {
        return str;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setStr(String str) {
        this.str = new String(str);
    }

}
