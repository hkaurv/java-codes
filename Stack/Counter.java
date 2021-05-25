package Stack;

public class Counter {

  String name=" ";
  int counter=0;
	public Counter(String str){
		this.name=str;
	}

	public void increment(){
//advance to next value
		counter++;
	}
    public int getCurrentvalue(){
		return counter;
	}
	public String toString(){

		return name+" : " + counter;

	}
	}


