class Factory{
	int items;
	boolean itemsInFactory;
	
	synchronized void produce(int items){
		if(itemsInFactory){
			try{
				wait();
			}catch(InterruptedException ie){}
			
		}
		this.items=items;
		itemsInFactory=true;
		System.out.println("produced items: "+items);
		notify();
	}

	synchronized int consume(){
		if(!itemsInFactory){
			try{
				wait();
			}catch(InterruptedException ie){}
		}
		System.out.println("items consumed: "+items);
		itemsInFactory=false;
		notify();
		return items;
	}
}


