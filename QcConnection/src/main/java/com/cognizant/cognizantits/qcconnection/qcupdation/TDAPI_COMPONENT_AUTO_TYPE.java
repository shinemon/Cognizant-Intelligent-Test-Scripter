/*  1:   */ package com.cognizant.cognizantits.qcconnection.qcupdation;
/*  2:   */ 
/*  3:   */ import com4j.ComEnum;
/*  4:   */ 
/*  5:   */ public enum TDAPI_COMPONENT_AUTO_TYPE
/*  6:   */   implements ComEnum
/*  7:   */ {
/*  8:11 */   MANUAL(
/*  9:   */   
/* 10:   */ 
/* 11:   */ 
/* 12:   */ 
/* 13:   */ 
/* 14:   */ 
/* 15:   */ 
/* 16:19 */     1),  KW(
/* 17:   */   
/* 18:   */ 
/* 19:   */ 
/* 20:   */ 
/* 21:   */ 
/* 22:   */ 
/* 23:   */ 
/* 24:28 */     2),  SCRIPTED(
/* 25:   */   
/* 26:   */ 
/* 27:   */ 
/* 28:   */ 
/* 29:   */ 
/* 30:   */ 
/* 31:   */ 
/* 32:37 */     3);
/* 33:   */   
/* 34:   */   private final int value;
/* 35:   */   
/* 36:   */   private TDAPI_COMPONENT_AUTO_TYPE(int value)
/* 37:   */   {
/* 38:41 */     this.value = value;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public int comEnumValue()
/* 42:   */   {
/* 43:42 */     return this.value;
/* 44:   */   }
/* 45:   */ }


/* Location:           D:\Prabu\jars\QC.jar
 * Qualified Name:     qcupdation.TDAPI_COMPONENT_AUTO_TYPE
 * JD-Core Version:    0.7.0.1
 */