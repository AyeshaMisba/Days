class SplitExample1{  
    public static void main(String[] args) {  
        String str = "Javatpointtt";  
        System.out.println("Returning words:");  
        String[] arr = str.split("t", 3);  
        for (String w : arr) {  
            System.out.println(w);  
        }  
        System.out.println("Split array length: "+arr.length);  
    }  
}  