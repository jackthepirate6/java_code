interface pata_nahi
{
    public int islarger(pata_nahi other);
}


class dog implements pata_nahi
{
    int x;
    
    public int findlargest(dog dog1,dog dog2)
{
    pata_nahi dogp1 = (pata_nahi) dog1;
    pata_nahi dogp2 = (pata_nahi) dog2;
    
    return(dogp1.islarger(dogp2));
}

    
    
    public int islarger(pata_nahi other)
    {
        dog otherdog = (dog) other;
        
        if(this.x > otherdog.x)
        {
            return this.x;
        }else{
            return otherdog.x;
        }
    }

    
	public static void main (String[] args) throws java.lang.Exception
	{
	   dog bruno = new dog();
	   bruno.x = 123;
	   dog moti = new dog();
	   moti.x = 98;
	   System.out.println(moti.islarger(bruno));
	   System.out.println(moti.findlargest(moti,bruno));
	}
}
