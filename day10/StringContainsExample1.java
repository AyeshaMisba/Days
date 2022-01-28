class StringContainsExample1{
    public static void main(String[] args) {
        String str = "hello world! i am using java programming language.";
        boolean isContains = str.contains("hello world!");
        System.out.println(isContains);
        System.out.println(str.contains("Hello world!"));

    }
}