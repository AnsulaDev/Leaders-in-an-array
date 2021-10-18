 class LeadersElements {
    static void leader(int a[],int n){
        int curr = a[n-1];
        System.out.print(curr + " ");

        for(int i=n-2; i>=0; i--){
            if(curr<a[i]){
                curr=a[i];
                System.out.print(curr + " ");
            }
        }
    }
    public static void main(String args[]){
        int a[]={7,10,4,10,6,5,2};
        int n=7;
        leader(a,n);

    }
}
