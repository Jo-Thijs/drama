/**
 *
 * CVS: $Header: /export/home0/cvsroot/socsg/DRAMA/Sources/be/ac/kuleuven/cs/drama/simulator/simple/decoders/DELDecoder.java,v 1.1.1.1 2001/09/07 09:41:38 dirkw Exp $
 *
 * (C) 2000
 * Katholieke Universiteit Leuven
 * Developed at Dept. Computer Science
 *
 */
// Decompiled by Jad v1.5.7f. Copyright 2000 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/SiliconValley/Bridge/8617/jad.html
// Decompiler options: packimports(3)
// Source File Name:   DELDecoder.java

package be.ac.kuleuven.cs.drama.simulator.simple.decoders;

import be.ac.kuleuven.cs.drama.simulator.basis.NumberFormat;
import java.math.BigInteger;

// Referenced classes of package be.ac.kuleuven.cs.drama.simulator.simple.decoders:
//            MathDecoder

public class DELDecoder extends MathDecoder {

   public DELDecoder() {}








   public String mnemocode() {
      return "DEL";
   }

   public int opcode() {
      return 24;
   }

   protected BigInteger operate(BigInteger biginteger, BigInteger biginteger1) {
      return transformToPos(transformToNeg(biginteger).divide(transformToNeg(biginteger1)));
   }

   private BigInteger transformToNeg(BigInteger biginteger) {
      return BigInteger.valueOf(NumberFormat.toJavaNumber(biginteger.longValue()));
   }

   private BigInteger transformToPos(BigInteger biginteger) {
      return BigInteger.valueOf(NumberFormat.toDramaNumber(biginteger.longValue()));
   }

}
