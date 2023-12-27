package TipDonustur;

public class Donustur {
	
	 public static int ikilikSekizlikDonustur(long binarySayi)
	    {
	        int sekizlikSayi = 0, onlukSayi = 0, i = 0;
	 
	        while(binarySayi != 0)
	        {
	            onlukSayi += (binarySayi % 10) * Math.pow(2, i);
	            ++i;
	            binarySayi /= 10;
	        }
	 
	        i = 1;
	 
	        while (onlukSayi != 0)
	        {
	            sekizlikSayi += (onlukSayi % 8) * i;
	            onlukSayi /= 8;
	            i *= 10;
	        }
	        return sekizlikSayi;
	    }
	 
	        public static long sekizlikIkilikDonustur(int sekizlikSayi)
	        {
	            int onlukSayi = 0, i = 0;
	            long ikilikSayi = 0;
	     
	            while(sekizlikSayi != 0)
	            {
	                onlukSayi += (sekizlikSayi % 10) * Math.pow(8, i);
	                ++i;
	                sekizlikSayi/=10;
	            }
	     
	            i = 1;
	     
	            while (onlukSayi != 0)
	            {
	                ikilikSayi += (onlukSayi % 2) * i;
	                onlukSayi /= 2;
	                i *= 10;
	            }
	     
	            return ikilikSayi;
	        }
	
	
	public static void main(String[] args) {
		 long binary = 101001;
	        int sekizlik = ikilikSekizlikDonustur(binary);
	        System.out.printf("%d (ikilik) = %d (sekizlik) \n", binary, sekizlik);
	        
	        sekizlik=765;
	        binary=sekizlikIkilikDonustur(sekizlik);
	        System.out.printf("%d (sekizlik) = %d (ikilik) \n", sekizlik, binary);

	}

}
