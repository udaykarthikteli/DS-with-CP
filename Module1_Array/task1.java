class Main {
    public static void main(String[] args) {
        int[]n={10,20,30,40};
        System.out.println(n[0]);
        System.out.println(n[1]);
        System.out.println(n[2]);
        System.out.println(n[3]);
        System.out.println(n.length);
        
        for(int i=0; i<n.length; i++){
            System.out.println("at index "+ i + "is" + n[i]);
        }
    }
}
