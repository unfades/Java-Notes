class Box50{
    private int length, breadth, height;

    Box50(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public String toString(){
        return "Box50{" + "length="+this.length + "breadth="+this.breadth + "height="+this.height;
    }
    //nice but unoptimal as the prototype is different, sirs is better as it points to obj b
    //so it is not really overriding, it's overloading
    //ANd this is a custom method. ANd sir's overrides. IT IS BETTER TO OVERRIDE WHEN
    //THE PURPOSE IS OVERRIDING THIS IS WHY SIRS IS MUCH BETTER.
    /* 
    public boolean equals(Box50 o){
        if(this.length == o.length && this.breadth == o.breadth && this.height == o.height) return true;
        return false;
    }
        */
    //This is the way to do it proper
    //THIS IS WHY @Override is theere it is an ANNOTATION
    //IT IS THERE TO VERIFY IF YOU ARE WRITING SYNTAX OF OVERRIDDEN METHOD PROPER 
    @Override //SEE EVERYTHING IS FINE HERE
    public boolean equals(Object o){
        Box50 temp = (Box50)o;
        if(this.length == temp.length && this.breadth == temp.breadth && this.height == temp.height){
            return true;
        }
        return false;
    }
    @Override  //NOW IT IS GIVING ERROR AS IT IS NOT PROPER OVERRIDING
    public boolean equals(Box50 o){
        if(this.length == o.length && this.breadth == o.breadth && this.height == o.height) return true;
        return false;
    }
}

public class UseBox50{
    public static void main(String[] args){
        Box50 b1 = new Box50(10,20,30);
        Box50 b2 = new Box50(10,20,30);

        //LOGICALLY b1 and b2 are the same
        //However their addresses are different

        System.out.println(b1);
        System.out.println(b2);
        //equals from Object class.
        //false, this is not what we want. We wanna compare content not addresses.
        //System.out.println(b1.equals(b2));

        //We are overriding equals now.
        System.out.println(b1.equals(b2));

    }
}


