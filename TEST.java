class TEST
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> a= new LinkedList<>();
		LinkedList<Integer> b= new LinkedList<>();
		for(int i=0;i<l1;i++){
			int x= scan.nextInt();
			a.addLast(x);
		}
		
		int l2= scan.nextInt();
		for(int i=0;i<l2;i++){
			int x= scan.nextInt();
			b.addLast(x);
		}
		
		int lmt= 400000;
		int i;
		for(i=0;i<lmt;i++){
			if(a.size()==0){
				System.out.println(i+" 2");
				break;
			}
			if(b.size()==0){
				System.out.println(i+" 1");
				break;
			}
			
			int y1= a.removeFirst();
			int y2= b.removeFirst();
			
			if(y1>y2){
				a.addLast(y2);
				a.addLast(y1);
			}else{
				b.addLast(y1);
				b.addLast(y2);
			}
		}
		if(i==lmt) System.out.println("-1");
	
		
	}
}
