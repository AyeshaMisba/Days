class FormatExample2{
    public static void main(String args[])
    {
        int num = 89754;
        String str = String.format("%07d", num);
        System.out.println(str);
    }
}