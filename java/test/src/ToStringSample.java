public class ToStringSample {
    String name;
    int age;
    public ToStringSample() {
        name = "Nanashi";
        age = 14;
    }
    public String toString() {
        return "ñºëOÇÕ" + name + "ÅAîNÇÕ" + age;
    }
    public String toOrgString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ToStringSample tss = new ToStringSample();
        System.out.println(tss);
        StringBuffer sb = new StringBuffer("object=").append(tss);
        System.out.println(sb);
        System.out.println(tss.toOrgString());
    }
}
