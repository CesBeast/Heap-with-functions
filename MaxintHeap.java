																		//Cesar Garcia
public class MaxIntHeap {
int data []= null;
int lastnode= -1;
private int sizeValue =0;
	
		 public MaxIntHeap()  {  // set array size to a default value of 20
			data= new int[20];
			sizeValue=0;
			lastnode= -1;
			 return;
		 }  
		 public MaxIntHeap( int m) {   //constructor that sets max size of array
			 if(m<=0){
			 System.out.println("Cant have size of array less than or equal to 0, size set to default 20.");
				 data= new int[20];
				 sizeValue=0;
				 lastnode=-1;
			 }
			 else{
				 data= new int[m];
				 sizeValue=0;
				 lastnode=-1;}
		 }   
		 public boolean isEmpty(){
			 if(sizeValue==0)
				 return true;
			 else
				 return false;  
			}
		 
		 public void fixHeapTrickleUp(int location){
			 while( location > 0 && data[location] > data[(location-1)/2]) {
				 int parentVal=data[(location-1)/2];
				 data[(location-1)/2]=data[location];
				 data[location]=parentVal;  //swaps child with parent
				 location=(location-1)/2;
				 }

		 }
		  public void fixHeapTrickleDown(int location) {
			  int i=location;
			  int leftChild;
			  int rightChild;
			  int tempPar;
			  leftChild = 2*i+1;
			  rightChild=2*i+2;
			while(data[leftChild]>data[i]||data[rightChild]>data[i]&&lastnode>=(2*i+1)){
				if(data[leftChild]>data[rightChild]&&lastnode>=(2*i+2)){
					tempPar=data[i];
					data[i]=data[leftChild];
					data[leftChild]=tempPar;
					i=2*i+1;
				}
			else if(lastnode>=(2*i+2)){
				tempPar=data[i];
				data[i]=data[rightChild];
				data[rightChild]=tempPar;
				i=2*i+2;
				}
				if((2*i)<=lastnode)
				leftChild = 2*i+1;
				rightChild=2*i+2;
				if(lastnode<(2*i+2))
					break;
			}
			
		}
		public int size() {

			return sizeValue;  
			}
		  public void heapInsert(int v) throws HeapException { 
			  if(lastnode==(data.length-1))
				throw new HeapException("Heap is Full, no more values will be entered.");
			  else{
				  if(lastnode==-1){
					  data[0]=v;
					  lastnode++;
					  sizeValue++;
					  }
				  else{ 
					  lastnode++;
					  data[lastnode]=v;//since root is at zero, it is accounted for.
					  sizeValue++;
					  fixHeapTrickleUp(lastnode);
				  }
			  }
		  }
		  public int  removeMax ()throws HeapException  {
			  if(sizeValue==0){
				  throw new HeapException("Heap is Empty, unable to remove value.");
			  }
			  else{
				  int tempnode=data[0];
				  data[0]=data[lastnode];
				  data[lastnode]=tempnode;
				  lastnode--;
				  sizeValue--;
				  fixHeapTrickleDown(0);
			  }
				  return 0;  
			}
		 public int max() throws HeapException  {
			 if(sizeValue==0){
				  throw new HeapException("Heap is Empty, unable to return value.");
			  }
			 else
				 return data[0];  
			} 
		 
		public void modifyHeap(int k , int newvalue) throws HeapException {
			if(k==0)
		throw new HeapException("Your are inserting into root of heap. Not Permitted");
			if(k==lastnode)
throw new HeapException("Your are inserting into the last index of heap. Not Permitted");
			data[k]=newvalue;
			if(data[(k-1)/2]<data[k]&&sizeValue!=0)
				fixHeapTrickleUp(k);
			else if(data[2*k+1]>data[k]||data[2*k+2]>data[k])
			fixHeapTrickleDown(k);
		}  
		// Changes value of kth index of heap to newvalue
		//AND efficiently adjusts heap so that heap remains a heap
		 
		public int[]  getHeapArray(){// return a truncated COPY of array holding heap val 
			int [] copy= new int [lastnode+1];
			int count=0;
			for(count=0;count<=lastnode;count++)
				copy[count]=data[count];
			return copy;  
			}   
		
	}


