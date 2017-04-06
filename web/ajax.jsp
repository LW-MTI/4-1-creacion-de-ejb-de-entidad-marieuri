
<%@page import="javax.naming.InitialContext"%>
<%@page import="mx.edu.ittepic.EJB.EJBPaisRemoto"%>
<!DOCTYPE html>

<%! 
    EJBPaisRemoto ejb=null;

    public void jsoInit(){
     try{
            InitialContext ic= new InitialContext();
	     ejb=(EJBPaisRemoto) ic.lookup(EJBPaisRemoto.class.getName());
      }catch(Exception e){
     		e.printStackTrace(); 
     }
    }
%>