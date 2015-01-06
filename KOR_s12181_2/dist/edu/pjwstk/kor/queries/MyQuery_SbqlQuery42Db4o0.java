package edu.pjwstk.kor.queries;

import com.db4o.*;
import com.db4o.ObjectContainer;

import com.db4o.foundation.*;

import com.db4o.internal.*;
import com.db4o.internal.btree.*;

import edu.pjwstk.kor.model.*;
import edu.pjwstk.kor.model.data.*;

import org.apache.commons.collections.CollectionUtils;

import pl.wcislo.sbql4j.db4o.*;
import pl.wcislo.sbql4j.exception.*;
import pl.wcislo.sbql4j.java.model.runtime.*;
import pl.wcislo.sbql4j.java.model.runtime.factory.*;
import pl.wcislo.sbql4j.java.utils.ArrayUtils;
import pl.wcislo.sbql4j.java.utils.OperatorUtils;
import pl.wcislo.sbql4j.java.utils.Pair;
import pl.wcislo.sbql4j.lang.codegen.nostacks.*;
import pl.wcislo.sbql4j.lang.codegen.simple.*;
import pl.wcislo.sbql4j.lang.db4o.*;
import pl.wcislo.sbql4j.lang.db4o.codegen.*;
import pl.wcislo.sbql4j.lang.db4o.codegen.interpreter.*;
import pl.wcislo.sbql4j.lang.db4o.codegen.nostacks.*;
import pl.wcislo.sbql4j.lang.parser.expression.*;
import pl.wcislo.sbql4j.lang.parser.expression.OrderByParamExpression.SortType;
import pl.wcislo.sbql4j.lang.parser.terminals.*;
import pl.wcislo.sbql4j.lang.parser.terminals.operators.*;
import pl.wcislo.sbql4j.lang.types.*;
import pl.wcislo.sbql4j.lang.xml.*;
import pl.wcislo.sbql4j.model.*;
import pl.wcislo.sbql4j.model.collections.*;
import pl.wcislo.sbql4j.util.*;
import pl.wcislo.sbql4j.util.Utils;
import pl.wcislo.sbql4j.xml.model.*;
import pl.wcislo.sbql4j.xml.parser.store.*;

import java.sql.Struct;

import java.text.SimpleDateFormat;

import java.util.*;
import java.util.Date;


public class MyQuery_SbqlQuery42Db4o0 implements Db4oSBQLQuery<java.lang.Double> {
    private java.util.Date param;

    public MyQuery_SbqlQuery42Db4o0(java.util.Date param) {
        this.param = param;
    }

    /**
     * query='dataBase.(0.0 +  sum (Payment as pm where pm.getPaymentDate() > param).pm.getPaymentType().getPaymentPrice())'
    '
     **/
    public java.lang.Double executeQuery(final ObjectContainerBase ocb,
        final Transaction t) {
        //evaluateExpression - start 0.0 +  sum (Payment as pm where pm.getPaymentDate() > param).pm.getPaymentType().getPaymentPrice()
        final LocalTransaction transLocal = (LocalTransaction) t;

        //visitBinaryAExpression - start 0.0 +  sum (Payment as pm where pm.getPaymentDate() > param).pm.getPaymentType().getPaymentPrice()
        //visitLiteralExpression - start 0.0
        //visitLiteralExpression - end 0.0
        //visitUnaryExpression - start  sum (Payment as pm where pm.getPaymentDate() > param).pm.getPaymentType().getPaymentPrice()
        //visitDotExpression - start (Payment as pm where pm.getPaymentDate() > param).pm.getPaymentType().getPaymentPrice()
        //visitDotExpression - start (Payment as pm where pm.getPaymentDate() > param).pm.getPaymentType()
        //visitDotExpression - start (Payment as pm where pm.getPaymentDate() > param).pm
        //visitWhereExpression - start Payment as pm where pm.getPaymentDate() > param
        //visitAsExpression - start Payment as pm
        //visitIdentifierExpression - start Payment
        final java.util.Collection<edu.pjwstk.kor.model.Payment> _ident_Payment = new java.util.ArrayList<edu.pjwstk.kor.model.Payment>();
        ClassMetadata _classMeta64 = ocb.classCollection()
                                        .getClassMetadata("edu.pjwstk.kor.model.Payment");
        long[] _ids64 = _classMeta64.getIDs(transLocal);

        for (long _id64 : _ids64) {
            LazyObjectReference _ref64 = transLocal.lazyReferenceFor((int) _id64);
            _ident_Payment.add((edu.pjwstk.kor.model.Payment) _ref64.getObject());
        }

        //visitIdentifierExpression - end Payment
        java.util.Collection<edu.pjwstk.kor.model.Payment> _asResult_pm = _ident_Payment;

        //visitAsExpression - end Payment as pm
        java.util.Collection<edu.pjwstk.kor.model.Payment> _whereResult = new java.util.ArrayList<edu.pjwstk.kor.model.Payment>();
        int _whereLoopIndex = 0;

        for (edu.pjwstk.kor.model.Payment _whereEl : _asResult_pm) {
            if (_whereEl == null) {
                continue;
            }

            if (_whereEl != null) {
                ocb.activate(_whereEl, 1);
            }

            //visitBinaryAExpression - start pm.getPaymentDate() > param
            //visitDotExpression - start pm.getPaymentDate()
            //visitIdentifierExpression - start pm
            edu.pjwstk.kor.model.Payment _ident_pm = _whereEl;

            if (_ident_pm != null) {
                ocb.activate(_ident_pm, 1);
            }

            //visitIdentifierExpression - end pm
            edu.pjwstk.kor.model.Payment _dotEl = _ident_pm;

            if (_ident_pm != null) {
                ocb.activate(_ident_pm, 2);
            }

            //visitMethodExpression - start getPaymentDate()
            java.util.Date _mth_getPaymentDateResult = _dotEl.getPaymentDate();

            if (_mth_getPaymentDateResult != null) {
                ocb.activate(_mth_getPaymentDateResult, 1);
            }

            //visitMethodExpression - end getPaymentDate()
            //visitDotExpression - end pm.getPaymentDate()
            //visitIdentifierExpression - start param
            java.util.Date _ident_param = param;

            //visitIdentifierExpression - end param
            //OperatorMore - start pm.getPaymentDate() > param
            Boolean _moreResult = (_mth_getPaymentDateResult == null)
                ? ((_mth_getPaymentDateResult == null) ? false : false)
                : ((_mth_getPaymentDateResult == null) ? true
                                                       : (_mth_getPaymentDateResult.compareTo(_ident_param) > 0));

            //OperatorMore - end pm.getPaymentDate() > param
            //visitBinaryAExpression - end pm.getPaymentDate() > param
            if (_moreResult) {
                _whereResult.add(_whereEl);
            }

            _whereLoopIndex++;
        }

        //visitWhereExpression - end Payment as pm where pm.getPaymentDate() > param
        java.util.Collection<edu.pjwstk.kor.model.Payment> _dotResult1 = new java.util.ArrayList<edu.pjwstk.kor.model.Payment>();
        int _dotIndex1 = 0;

        for (edu.pjwstk.kor.model.Payment _dotEl1 : _whereResult) {
            if (_dotEl1 == null) {
                continue;
            }

            if (_dotEl1 != null) {
                ocb.activate(_dotEl1, 1);
            }

            //visitIdentifierExpression - start pm
            edu.pjwstk.kor.model.Payment _ident_pm1 = _dotEl1;

            if (_ident_pm1 != null) {
                ocb.activate(_ident_pm1, 1);
            }

            //visitIdentifierExpression - end pm
            if (_ident_pm1 != null) {
                ocb.activate(_ident_pm1, 1);
            }

            _dotResult1.add(_ident_pm1);
            _dotIndex1++;
        }

        //visitDotExpression - end (Payment as pm where pm.getPaymentDate() > param).pm
        java.util.Collection<edu.pjwstk.kor.model.PaymentType> _dotResult2 = new java.util.ArrayList<edu.pjwstk.kor.model.PaymentType>();
        int _dotIndex2 = 0;

        for (edu.pjwstk.kor.model.Payment _dotEl2 : _dotResult1) {
            if (_dotEl2 == null) {
                continue;
            }

            if (_dotEl2 != null) {
                ocb.activate(_dotEl2, 1);
            }

            //visitMethodExpression - start getPaymentType()
            edu.pjwstk.kor.model.PaymentType _mth_getPaymentTypeResult = _dotEl2.getPaymentType();

            if (_mth_getPaymentTypeResult != null) {
                ocb.activate(_mth_getPaymentTypeResult, 1);
            }

            //visitMethodExpression - end getPaymentType()
            if (_mth_getPaymentTypeResult != null) {
                ocb.activate(_mth_getPaymentTypeResult, 1);
            }

            _dotResult2.add(_mth_getPaymentTypeResult);
            _dotIndex2++;
        }

        //visitDotExpression - end (Payment as pm where pm.getPaymentDate() > param).pm.getPaymentType()
        java.util.Collection<java.lang.Double> _dotResult3 = new java.util.ArrayList<java.lang.Double>();
        int _dotIndex3 = 0;

        for (edu.pjwstk.kor.model.PaymentType _dotEl3 : _dotResult2) {
            if (_dotEl3 == null) {
                continue;
            }

            if (_dotEl3 != null) {
                ocb.activate(_dotEl3, 1);
            }

            //visitMethodExpression - start getPaymentPrice()
            java.lang.Double _mth_getPaymentPriceResult = _dotEl3.getPaymentPrice();

            if (_mth_getPaymentPriceResult != null) {
                ocb.activate(_mth_getPaymentPriceResult, 1);
            }

            //visitMethodExpression - end getPaymentPrice()
            if (_mth_getPaymentPriceResult != null) {
                ocb.activate(_mth_getPaymentPriceResult, 1);
            }

            _dotResult3.add(_mth_getPaymentPriceResult);
            _dotIndex3++;
        }

        //visitDotExpression - end (Payment as pm where pm.getPaymentDate() > param).pm.getPaymentType().getPaymentPrice()
        //OperatorSum - start  sum (Payment as pm where pm.getPaymentDate() > param).pm.getPaymentType().getPaymentPrice()
        Number _sum1 = null;

        for (Number _sumEl1 : _dotResult3) {
            _sum1 = MathUtils.sum(_sum1, _sumEl1);
        }

        java.lang.Double _sumResult = (java.lang.Double) _sum1;

        //OperatorSum - end  sum (Payment as pm where pm.getPaymentDate() > param).pm.getPaymentType().getPaymentPrice()
        //visitUnaryExpression - end  sum (Payment as pm where pm.getPaymentDate() > param).pm.getPaymentType().getPaymentPrice()
        //OperatorPlus - start 0.0 +  sum (Payment as pm where pm.getPaymentDate() > param).pm.getPaymentType().getPaymentPrice()
        java.lang.Double _plusResult = 0.0 + _sumResult;
        //OperatorPlus - end 0.0 +  sum (Payment as pm where pm.getPaymentDate() > param).pm.getPaymentType().getPaymentPrice()
        //visitBinaryAExpression - end 0.0 +  sum (Payment as pm where pm.getPaymentDate() > param).pm.getPaymentType().getPaymentPrice()
        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_plusResult, ocb);

        return _plusResult;

        //evaluateExpression - end 0.0 +  sum (Payment as pm where pm.getPaymentDate() > param).pm.getPaymentType().getPaymentPrice()
    }
}
