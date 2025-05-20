public class arrstr {
    public static void main(String[] args) {
        String str =  "Hello World!, this is the first line, this is the second line";
        char[] arr = new char[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==',' && arr[i+1]==' '){
                System.out.println();
                i++;
                continue;
            }
            System.out.print(arr[i]);
        }
    }
}
