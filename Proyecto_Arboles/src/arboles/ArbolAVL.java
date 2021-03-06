/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import java.util.ArrayList;

/**
 *
 * @author jorge.reyes
 */
public class ArbolAVL {
  protected NodoAVL raiz;
  protected ArrayList searched;
    
    public ArbolAVL(String o, int n){
      raiz = new NodoAVL(o, n);
    }
   
    public void inOrden(){
       if(raiz!=null)
           raiz.inOrden();
    }
    
    public void preOrden(){
       if(raiz!=null)
           raiz.preOrden();
    }
    
    public void posOrden(){
       if(raiz!=null)
           raiz.posOrden();
    }
    
    public ArrayList buscar(String o){
        ArrayList referenciasEnLista;
        referenciasEnLista = buscar(raiz, o);
        return referenciasEnLista;
    }
  
    private ArrayList buscar(NodoAVL n, String o) throws ItemNotFoundException{
        
        if(o.compareTo( n.getDato() ) == 0){
            searched = n.getReferencia();
        }
        if (o.compareTo( n.getDato() ) > 0 ){
            if (n.getIzq()==null){
                throw new ItemNotFoundException("No está el dato :(");
            }
            else{
                buscar((NodoAVL) n.getIzq(),o);
            }
        }
        else{
            if( o.compareTo( n.getDato() ) < 0 ){
                if (n.getDer()==null){
                    throw new ItemNotFoundException("No está el dato :(");
                } 
                else{
                    buscar((NodoAVL) n.getDer(),o);     
                }  
            }
            else{
                System.out.println( n.getDato() + " sí está en el árbol: \n");
                searched = n.getReferencia();
            }
        }
        return searched;
    }
    
    public void insertar(String o, int n){
    insertarOrdenado(raiz,o, n);
  }
    
    private void insertarOrdenado(NodoAVL n, String o, int b){  
        if(o.compareTo( n.getDato() ) == 0){
            n.referencia.add(b);
        }
        if ( o.compareTo( n.getDato() )  > 0){
            if (n.getIzq()==null){
                n.setIzq(new NodoAVL(o,b,null,null,n));
                recalcularFE(n);
            }
            else
                insertarOrdenado((NodoAVL)n.getIzq(),o, b);
            }
        else{
            if( o.compareTo( n.getDato() ) < 0){
                if (n.getDer()==null){
                    n.setDer(new NodoAVL(o,b,null,null,n));
                    recalcularFE(n);
                }
            else
               insertarOrdenado((NodoAVL)n.getDer(),o, b);     
            }  
        }
    }
   
   public void recalcularFE(NodoAVL nodo){
     if (nodo!=null){
       nodo.setFE(
               NodoAVL.altura((NodoAVL)nodo.getDer()) - 
               NodoAVL.altura((NodoAVL)nodo.getIzq())
               );
       if(nodo.getFE() == 2 || nodo.getFE()==-2)
           balancear(nodo);
       else
           recalcularFE(nodo.getPadre());
     }   
   }
   
   public void balancear(NodoAVL nodo){
   int feActual = nodo.getFE();
   if(feActual == 2){
     switch(((NodoAVL)nodo.getDer()).getFE()){
         case 0:
         case 1:
             rotacionDD(nodo);
             System.out.println("Aplicando rotación DD..");
             break;
         case -1:
             rotacionDI(nodo);
             System.out.println("Aplicando rotación DI..");
             break;     
     }   
   }
   else{
   switch(((NodoAVL)nodo.getIzq()).getFE()){
         case 0:
         case -1:
             rotacionII(nodo);
             System.out.println("Aplicando rotación II..");
             break;
         case 1:
             rotacionID(nodo);
             System.out.println("Aplicando rotación ID..");
             break;     
     }   
   }
  }
   
   
   public void rotacionII(NodoAVL nodo){
   //Establecer los apuntadores..
    NodoAVL Padre = nodo.getPadre();   
    NodoAVL P = nodo;
    NodoAVL Q = (NodoAVL)P.getIzq();
    NodoAVL B = (NodoAVL)Q.getDer();
    
    //Ajustar hijos
    if (Padre!= null)
        if (Padre.getDer()==P) Padre.setDer(Q);
          else
            Padre.setIzq(Q);
    else
        raiz = Q;
    //Reconstruir el arbol
    P.setIzq(B);
    Q.setDer(P);
    
    //Reasignar Padres
    P.setPadre(Q);
    if (B!=null) B.setPadre(P);
    Q.setPadre(Padre);
    
    //Ajustar los valores de los FE
     P.setFE(0);
     Q.setFE(0);
   }
   
   public void rotacionDD(NodoAVL nodo){
       //Establecer los apuntadores..
    NodoAVL Padre = nodo.getPadre();   
    NodoAVL P = nodo;
    NodoAVL Q = (NodoAVL)P.getDer();
    NodoAVL B = (NodoAVL)Q.getIzq();
    
    //Ajustar hijos
    if (Padre!= null)
        if (Padre.getIzq()==P) Padre.setIzq(Q);
          else
            Padre.setDer(Q);
    else
        raiz = Q;
    //Reconstruir el arbol
    P.setDer(B);
    Q.setIzq(P);
    
    //Reasignar Padres
    P.setPadre(Q);
    if (B!=null) B.setPadre(P);
    Q.setPadre(Padre);
    
    //Ajustar los valores de los FE
     P.setFE(0);
     Q.setFE(0);
   }
   
   public void rotacionID(NodoAVL nodo){
     NodoAVL Padre = nodo.getPadre();
     NodoAVL P = nodo;
     NodoAVL Q = (NodoAVL)P.getIzq();
     NodoAVL R = (NodoAVL)Q.getDer();
     NodoAVL B = (NodoAVL)R.getIzq();
     NodoAVL C = (NodoAVL)R.getDer();
     
     if(Padre!=null)
       if (Padre.getDer() == nodo)
           Padre.setDer(R);
       else
           Padre.setIzq(R);
     else
       raiz = R;
     //Reconstrucción del árbol
     Q.setDer(B);
     P.setIzq(C);
     R.setIzq(Q);
     R.setDer(P);
     //Reasignación de padres
     R.setPadre(Padre);
     P.setPadre(R);
     Q.setPadre(R);
     if(B!=null)
         B.setPadre(Q);
     if (C!=null)
         C.setPadre(P);
     //Ajusta los valores de los factores de equilibrio 
     switch(R.getFE()){
         case -1:
             Q.setFE(0);
             P.setFE(1);
             break;
         case 0:
             Q.setFE(0);
             P.setFE(0);
             break;
         case 1:
             Q.setFE(-1);
             P.setFE(0);
             break;
     }
     R.setFE(0);          
   }
   
   public void rotacionDI(NodoAVL nodo){
       NodoAVL Padre = nodo.getPadre();
     NodoAVL P = nodo;
     NodoAVL Q = (NodoAVL)P.getDer();
     NodoAVL R = (NodoAVL)Q.getIzq();
     NodoAVL B = (NodoAVL)R.getDer();
     NodoAVL C = (NodoAVL)R.getIzq();
     
     if(Padre!=null)
       if (Padre.getIzq() == nodo)
           Padre.setIzq(R);
       else
           Padre.setDer(R);
     else
       raiz = R;
     //Reconstrucción del árbol
     Q.setIzq(B);
     P.setDer(C);
     R.setDer(Q);
     R.setIzq(P);
     //Reasignación de padres
     R.setPadre(Padre);
     P.setPadre(R);
     Q.setPadre(R);
     if(B!=null)
         B.setPadre(Q);
     if (C!=null)
         C.setPadre(P);
     //Ajusta los valores de los factores de equilibrio 
     switch(R.getFE()){
         case -1:
             Q.setFE(0);
             P.setFE(1);
             break;
         case 0:
             Q.setFE(0);
             P.setFE(0);
             break;
         case 1:
             Q.setFE(-1);
             P.setFE(0);
             break;
     }
     R.setFE(0);
   }
    
}
