
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

 
 
public class ConverteTest {

    @Test
    void ConverteI(){        
     
        assertEquals("1",Converte.Converte1("I"));
    }
    @Test
    void ConverteV(){        
    
        assertEquals("5",Converte.Converte1("V"));
    }

    @Test
    void ConverteX(){        
   
        assertEquals("10",Converte.Converte1("X"));
    }

    @Test
    void ConverteL(){        
    
        assertEquals("50",Converte.Converte1("L"));
    }

    @Test
    void ConverteC(){        
     
        assertEquals("100",Converte.Converte1("C"));
    }

    @Test
    void ConverteD(){        
         
        assertEquals("500",Converte.Converte1("D"));
    }
    @Test
    void ConverteM(){        
     
        assertEquals("1000",Converte.Converte1("M"));
    }

    @Test
    void ConverteII(){        
       assertEquals("2",Converte.Converte1("II"));
    }
 
    
    @Test
    void ConverteVV(){        
       assertEquals("10",Converte.Converte1("VV"));
    }
    @Test
    void ConverteXX(){        
       assertEquals("20",Converte.Converte1("XX"));
    }

    @Test
    void ConverteLL(){        
       assertEquals("100",Converte.Converte1("LL"));
    }

    @Test
    void ConverteCC(){        
       assertEquals("200",Converte.Converte1("CC"));
    }


@Test
    void ConverteDD(){        
       assertEquals("1000",Converte.Converte1("DD"));
    }

    @Test
    void ConverteMM(){        
       assertEquals("2000",Converte.Converte1("MM"));
    }

    @Test
    void ConverteDCLXVI(){        
       assertEquals("666",Converte.Converte1("DCLXVI"));
    }
    
    @Test
    void ConverteMCX(){        
        assertEquals("1110",Converte.Converte1("mcx"));
    
 } 
 
 
 @Test
 void ConverteDI(){        
     assertEquals("501",Converte.Converte1("DI"));
    }
    
    
    @Test
    void ConverteLX(){        
        assertEquals("60",Converte.Converte1("LX"));
    }
    
    
    @Test
    void ConverteCMXCIX(){        
        assertEquals("999",Converte.Converte1("CMXCIX"));
        
    }



    @Test
    void ConverteMDCCLX(){        
        assertEquals("1760",Converte.Converte1("MDCCLX"));
       }



}





