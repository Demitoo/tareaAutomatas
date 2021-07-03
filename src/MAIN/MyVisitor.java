package MAIN;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import ANTLR.ParserTBaseVisitor;
import ANTLR.ParserTParser;
import ANTLR.ParserTParser.PrintContext;
import ANTLR.ParserTParser.StatementContext;
import ANTLR.ParserTParser.While_blockContext;
import ANTLR.ParserTParser.AssignContext;
import ANTLR.ParserTParser.BlockContext;
import ANTLR.ParserTParser.Content_blockContext;
import ANTLR.ParserTParser.Condition_blockContext;
import ANTLR.ParserTParser.OperationContext;
import ANTLR.ParserTParser.For_operationContext;
import ANTLR.ParserTParser.For_blockContext;
import ANTLR.ParserTParser.ReadContext;
import ANTLR.ParserTParser.DeclareContext;
import ANTLR.ParserTParser.If_blockContext;



import java.math.*;

public class MyVisitor extends ParserTBaseVisitor<Integer> {
	private Map<String, String>  variables = new HashMap<String, String>();
	
	@Override
	public Integer visitAssign(AssignContext ctx){
		String id1=ctx.ID().getText();
		int value1=0;
		if(!variables.containsKey(id1)) {
			throw new IllegalArgumentException("La variable " +id1 +" no esta declarada");
		}else {
			value1=visitOperation(ctx.operation());
			variables.put(id1, String.valueOf(value1));
		}
        return 0;
    }
	
	@Override
	public Integer visitDeclare(DeclareContext ctx){
		String nueva="";
		if(ctx.assign()!=null) {
			if(variables.containsKey(ctx.assign().ID().getText())) {
				throw new IllegalArgumentException("La variable ya fue declarada");
			}else {
				variables.put(ctx.assign().ID().getText(), String.valueOf(nueva));
			}
			visitAssign(ctx.assign());
		}else {
			String id=ctx.ID().getText();
			if(variables.containsKey(id)) {
				throw new IllegalArgumentException("La variable ya fue declarada");
			}else {
				variables.put(id, String.valueOf(nueva));
			}
		}
        return 0;
    }
	
	
	
	
	@Override
	public Integer visitPrint(PrintContext ctx){	        
	        String output = "";
	        if (ctx.ID() == null)
	        	output = ctx.NUMBER().getText(); 
	        else
	        	output = variables.get(ctx.ID().getText()).toString();
	        
	        System.out.println(output);
	        return 0;
	}
	/*@Override
	
	public Integer visitSuma(SumaContext ctx){
		//OBTENER NOMBRE Y ASIGNAR VALUE EN CASO DE EXISTIR PRIMERA VARIABLE
		    float value1=0;
		    float value2=0;
		    String id1=ctx.ID(0).getText();
		    //variable=Integer.parseInt(ctx.ID(0).getText());
		    if(!variables.containsKey(id1)){
		    	throw new IllegalArgumentException("Variable '" + id1 + "' no esta declarada");
		    }else {
		    	value1=Integer.parseInt(variables.get(id1));
		    }
		 // " DE SEGUNDA VARIABLE
		    if(ctx.ID().size()>1) {
		    	 String id2=ctx.ID(1).getText();
		    	 if(!variables.containsKey(id2)){
				    	throw new IllegalArgumentException("Variable '" + id2 + "' no esta declarada");
				    }else {
				    	value2=Integer.parseInt(variables.get(id2));
				    }	
		    }else if(ctx.NUMBER()!=null){
		    	value2=Integer.parseInt(ctx.NUMBER().getText());
		    }else if(ctx.FLOAT()!=null){
		    	value2=Float.parseFloat(ctx.FLOAT().getText());
		    }else {
		    	throw new IllegalArgumentException("Tipo de dato no valido");
		    }
		    System.out.println(value1);
		    System.out.println(value2);
		    variables.put(id1, String.valueOf(value1+value2));
		    System.out.println(variables.get(id1));
	        return 0;
	}*/
	 /*@Override
	 public Integer visitAdd(AddContext ctx) {
		 String variableName;
		 //variableName : variable a modificar en tabla de sim
		 //System.out.println(ctx.ID().size());                                     ADD (NUMBER|ID) TO ID
		if (ctx.ID().size() > 1) {
			variableName = ctx.ID(1).getText();
			//System.out.println(ctx.ID(1).getText());
		}else {
			variableName = ctx.ID(0).getText();
			//System.out.println(ctx.ID(0).getText());
		}		
		 
		 // value : variable con el valor a sumar a variable variableName    
	    int value=0;
	    if (ctx.ID().size() > 1) {
		    if (!variables.containsKey(ctx.ID(0).getText()))
	            throw new IllegalArgumentException("Variable '" + ctx.ID(0).getText() + "' has not ben declared");
			else {
				if (ctx.ID().size() > 1) {
					value = Integer.parseInt(variables.get(ctx.ID(0).getText()));
					//System.out.println(value);
				}else {
					value = Integer.parseInt(ctx.NUMBER().getText());
					//System.out.println(value);
				}   
			}
	    }
		if (!variables.containsKey(variableName))
            throw new IllegalArgumentException("Variable '" + variableName + "' has not ben declared");
		else
			variables.put(variableName, String.valueOf(Integer.parseInt(variables.get(variableName)) + value));	    	     
		return 0;
	 }*/
	 
	 @Override 
	 public Integer visitIf_block(If_blockContext ctx) { 
		 Integer salida = 0;
		 
		 if(ctx.content_block()==null) {
			 throw new IllegalArgumentException("No hay contenido en la condicion");
		 }
		 
		 salida = visitCondition_block(ctx.condition_block());
		 System.out.println("xddd");
		 System.out.println(salida);
		 
		 if(ctx.content_block().size()>1) {
			 if(salida==1) {
				 visitContent_block(ctx.content_block(1));
			 }
		 }else {
			if(salida!=1) {
			visitContent_block(ctx.content_block(0));}
		 }
		 return salida; 
	 }
	 
	 @Override
	 public Integer visitCondition_block(Condition_blockContext ctx) {
		//System.out.println("childcount en if:"+ctx.getChildCount());
		Integer salidaCondition = -1;
		Integer salidaStatement = -1;

		salidaStatement = visitOperation(ctx.operation());
		if(salidaStatement==0) {
			salidaCondition=0;
		}else if(salidaStatement==1){
			salidaCondition=1;
		}else{
			salidaCondition=0;
		}
		return salidaCondition;
	 }
	/* @Override 
	 public Integer visitElse_block(Else_blockContext ctx) { 
		 Integer salida = 0;
		 if(ctx.block()!=null)
			salida = visitBlock(ctx.block());
		 else
			throw new IllegalArgumentException("ELSE sin statements");
		 return salida; 
	 }*/
	 
	 @Override 
	 public Integer visitBlock(BlockContext ctx) { 
		 Integer salida =0;
		 //System.out.println("cant de statement"+ctx.getChildCount());

		 for(int indice = 0;indice<ctx.getChildCount();indice++)
		 {
			 salida= visitStatement(ctx.statement(indice));
		 }
		 return salida; 
	 }
	 
	 @Override 
	 public Integer visitContent_block(Content_blockContext ctx) { 
		 Integer salida =0;
		 salida=visitBlock(ctx.block());
		 return salida; 
	 }
	 
	 
	 @Override 
	 public Integer visitOperation(OperationContext ctx) { 
		 String id1="";
		 String id2="";
		 String value1 ="";
		 String value2 ="";
		 Integer salida = -1;
		 
		 
		 if(ctx.getChildCount()==1){
             if(ctx.RAIZ()!= null || ctx.COSENO()!= null || ctx.LOGARITMO()!=null || ctx.SENO()!=null) {
            	 value1=String.valueOf(visitOperation(ctx.operation(0)));
            	 if (ctx.RAIZ()!=null){;
				   salida=(int)Math.sqrt(Float.parseFloat(value1));
			     }else if (ctx.COSENO()!=null){
				    salida=(int)Math.cos(Float.parseFloat(value1));
			     }else if (ctx.SENO()!=null){
				    salida=(int)Math.sin(Float.parseFloat(value1));
			     }else if (ctx.LOGARITMO()!=null){
				    salida=(int)Math.log10(Float.parseFloat(value1));
			     } 
			 }else {
				 
			 if(ctx.NUMBER()!=null) {
				 value1=ctx.NUMBER().getText(); 
			 }else if(ctx.FLOAT()!=null) {
				 value1=ctx.FLOAT().getText(); 
			 }else if(ctx.ID()!=null) {
				 id1=ctx.ID().getText();
				 if(variables.containsKey(id1)) {
					 value1=variables.get(id1);
				 }else {
					 throw new IllegalArgumentException("Variable '" + id1 + "' has not ben declared");
				 }
			 }}
			 salida=Integer.valueOf(value1);
		 }else {
			 value1=String.valueOf(visitOperation(ctx.operation(0)));
			 value2=String.valueOf(visitOperation(ctx.operation(1)));
			 if(ctx.EQUAL()!=null) {
				 if(value1.equals(value2)) {
					 salida=0;
				 }else {
					 salida=1;
				 }
			 }else if(ctx.Y()!=null) {  
				 if(value1.equals("0") && value2.equals("0")) {
					 salida=0;
				 }else {
					 salida=1;
				 } 
			 }else if(ctx.O()!=null) { 
				 if(value1.equals("0") || value2.equals("0")) {
					 salida=0;
				 }else {
					 salida=1;
				 } 
			 }else if(ctx.SUMA()!=null) {
				 salida=Integer.parseInt(value1)+Integer.parseInt(value2);
			 }else if (ctx.RESTA()!=null) {
				 salida=Integer.parseInt(value1)-Integer.parseInt(value2);
			 }else if (ctx.DIVISION()!=null) {
				 salida=Integer.parseInt(value1)/Integer.parseInt(value2);
			 }else if(ctx.MULTIPLICACION()!=null){
				 salida=Integer.parseInt(value1)*Integer.parseInt(value2);
			 }
		 }
		 
		 
		 /*if(ctx.getChildCount()==1){ 
			 id1 = ctx.ID().getText();
			 if (!variables.containsKey(id1))
		            throw new IllegalArgumentException("Variable '" + id1 + "' has not ben declared");
			 else {
					value1 = variables.get(id1);
					if(value1.equals("true")) {
						 salida = 0;
					}else if (value1.equals("false")) {
					 	salida = 1;
					}else{ 
						 salida = Integer.valueOf(value1);
					}			 
			 }		 
		 }else {
			 id1 = ctx.getChild(0).getText();
			 id2 = ctx.getChild(2).getText();
			 if (!variables.containsKey(id1))
		            throw new IllegalArgumentException("Variable '" + id1 + "' has not ben declared");
			 else if (!variables.containsKey(id2))
		            throw new IllegalArgumentException("Variable '" + id2 + "' has not ben declared");
			 else {
				 value1 = variables.get(id1);
				 value2 = variables.get(id2);
				//System.out.println(value1+" "+value2);
				 if(ctx.EQUAL().getText().equals("==")){
					 if(value1 == value2) {
						 salida = 0;
					 }else {
						 salida = 1;
					 }
				 }
			 }
		 } */
		 return salida; 	 
	 }
	 
	 @Override 
	 public Integer visitWhile_block(While_blockContext ctx) { 
		 Integer salida=0;
		 while(salida==0){
			 salida = visitCondition_block(ctx.condition_block());
			 visitContent_block(ctx.content_block());
		 }
		 
		 return salida; 	 
	 }
	 
	 @Override 
	 public Integer visitStatement(StatementContext ctx) { 
		 Integer salida = 0;
		 
		 if(ctx.assign()!=null) {
			 salida = visitAssign(ctx.assign());
		 }else if(ctx.print()!=null) {
			 salida = visitPrint(ctx.print());
		 }else if(ctx.if_block()!=null) {
			 salida = visitIf_block(ctx.if_block());
		 }else if(ctx.while_block()!=null){
			 salida = visitWhile_block(ctx.while_block());
		 }else if(ctx.declare()!=null) {
			 salida= visitDeclare(ctx.declare());
		 }
		 /*for(int indice = 0;indice<list.size();indice++)
		 {
			 if(list.get(indice).assign()!=null) {
				 salida = visitAssign(list.get(indice).assign());
			 }else if(list.get(indice).add()!=null) {
				 salida = visitAdd(list.get(indice).add());
			 }else if(list.get(indice).print()!=null) {
				 salida = visitPrint(list.get(indice).print());
			 }else if(list.get(indice).if_block()!=null) {
				 salida = visitIf_block(list.get(indice).if_block());
			 }
		 }*/
		
		 return salida; 
	 }
}
