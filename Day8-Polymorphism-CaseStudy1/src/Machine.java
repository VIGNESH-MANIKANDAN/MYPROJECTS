
public class Machine 
{
	int              produceShoePolish    (int coalPieces) //      Return 100ml for every 
	{
		return ((coalPieces/5)*100);
	}
 
     int              produceShoePolish   (float hairStrand)   //  Return 100ml for every  9.83m of hair
{
	
	return ((int)(hairStrand/9.83)*100);
}
   
int              produceShoePolish    (String coalMsg )   //Return 100ml for every  27 "coal" words on the paper
{
	return (Integer.parseInt(coalMsg)/100);
}
}
