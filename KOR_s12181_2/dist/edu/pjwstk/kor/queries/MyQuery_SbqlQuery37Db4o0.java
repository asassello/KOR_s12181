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


public class MyQuery_SbqlQuery37Db4o0 implements Db4oSBQLQuery<java.lang.Double> {
    public MyQuery_SbqlQuery37Db4o0() {
    }

    /**
     * query='dataBase.( avg(Shipment.Payment.getPaymentType().getPaymentPrice()) as sredniaCenaPrzesylki)'
    '
     **/
    public java.lang.Double executeQuery(final ObjectContainerBase ocb,
        final Transaction t) {
        //evaluateExpression - start  avg(Shipment.Payment.getPaymentType().getPaymentPrice()) as sredniaCenaPrzesylki
        final LocalTransaction transLocal = (LocalTransaction) t;

        //visitAsExpression - start  avg(Shipment.Payment.getPaymentType().getPaymentPrice()) as sredniaCenaPrzesylki
        //visitUnaryExpression - start  avg(Shipment.Payment.getPaymentType().getPaymentPrice())
        //visitDotExpression - start Shipment.Payment.getPaymentType().getPaymentPrice()
        //visitDotExpression - start Shipment.Payment.getPaymentType()
        //visitDotExpression - start Shipment.Payment
        //visitIdentifierExpression - start Shipment
        final java.util.Collection<edu.pjwstk.kor.model.Shipment> _ident_Shipment =
            new java.util.ArrayList<edu.pjwstk.kor.model.Shipment>();
        ClassMetadata _classMeta53 = ocb.classCollection()
                                        .getClassMetadata("edu.pjwstk.kor.model.Shipment");
        long[] _ids53 = _classMeta53.getIDs(transLocal);

        for (long _id53 : _ids53) {
            LazyObjectReference _ref53 = transLocal.lazyReferenceFor((int) _id53);
            _ident_Shipment.add((edu.pjwstk.kor.model.Shipment) _ref53.getObject());
        }

        //visitIdentifierExpression - end Shipment
        java.util.Collection<edu.pjwstk.kor.model.Payment> _dotResult = new java.util.ArrayList<edu.pjwstk.kor.model.Payment>();
        int _dotIndex = 0;

        for (edu.pjwstk.kor.model.Shipment _dotEl : _ident_Shipment) {
            if (_dotEl == null) {
                continue;
            }

            if (_dotEl != null) {
                ocb.activate(_dotEl, 1);
            }

            //visitIdentifierExpression - start Payment
            final java.util.Collection<edu.pjwstk.kor.model.Payment> _ident_Payment =
                new java.util.ArrayList<edu.pjwstk.kor.model.Payment>();
            ClassMetadata _classMeta54 = ocb.classCollection()
                                            .getClassMetadata("edu.pjwstk.kor.model.Payment");
            long[] _ids54 = _classMeta54.getIDs(transLocal);

            for (long _id54 : _ids54) {
                LazyObjectReference _ref54 = transLocal.lazyReferenceFor((int) _id54);
                _ident_Payment.add((edu.pjwstk.kor.model.Payment) _ref54.getObject());
            }

            //visitIdentifierExpression - end Payment
            if (_ident_Payment != null) {
                ocb.activate(_ident_Payment, 2);
            }

            _dotResult.addAll(_ident_Payment);
            _dotIndex++;
        }

        //visitDotExpression - end Shipment.Payment
        java.util.Collection<edu.pjwstk.kor.model.PaymentType> _dotResult1 = new java.util.ArrayList<edu.pjwstk.kor.model.PaymentType>();
        int _dotIndex1 = 0;

        for (edu.pjwstk.kor.model.Payment _dotEl1 : _dotResult) {
            if (_dotEl1 == null) {
                continue;
            }

            if (_dotEl1 != null) {
                ocb.activate(_dotEl1, 1);
            }

            //visitMethodExpression - start getPaymentType()
            edu.pjwstk.kor.model.PaymentType _mth_getPaymentTypeResult = _dotEl1.getPaymentType();

            if (_mth_getPaymentTypeResult != null) {
                ocb.activate(_mth_getPaymentTypeResult, 1);
            }

            //visitMethodExpression - end getPaymentType()
            if (_mth_getPaymentTypeResult != null) {
                ocb.activate(_mth_getPaymentTypeResult, 1);
            }

            _dotResult1.add(_mth_getPaymentTypeResult);
            _dotIndex1++;
        }

        //visitDotExpression - end Shipment.Payment.getPaymentType()
        java.util.Collection<java.lang.Double> _dotResult2 = new java.util.ArrayList<java.lang.Double>();
        int _dotIndex2 = 0;

        for (edu.pjwstk.kor.model.PaymentType _dotEl2 : _dotResult1) {
            if (_dotEl2 == null) {
                continue;
            }

            if (_dotEl2 != null) {
                ocb.activate(_dotEl2, 1);
            }

            //visitMethodExpression - start getPaymentPrice()
            java.lang.Double _mth_getPaymentPriceResult = _dotEl2.getPaymentPrice();

            if (_mth_getPaymentPriceResult != null) {
                ocb.activate(_mth_getPaymentPriceResult, 1);
            }

            //visitMethodExpression - end getPaymentPrice()
            if (_mth_getPaymentPriceResult != null) {
                ocb.activate(_mth_getPaymentPriceResult, 1);
            }

            _dotResult2.add(_mth_getPaymentPriceResult);
            _dotIndex2++;
        }

        //visitDotExpression - end Shipment.Payment.getPaymentType().getPaymentPrice()
        //OperatorAvg - start  avg(Shipment.Payment.getPaymentType().getPaymentPrice())
        java.lang.Double _avgResult = 0d;

        if ((_dotResult2 != null) && !_dotResult2.isEmpty()) {
            Number _avgSum6 = null;

            for (Number _avgEl6 : _dotResult2) {
                _avgSum6 = MathUtils.sum(_avgSum6, _avgEl6);
            }

            _avgResult = _avgSum6.doubleValue() / _dotResult2.size();
        }

        //OperatorAvg - end  avg(Shipment.Payment.getPaymentType().getPaymentPrice())
        //visitUnaryExpression - end  avg(Shipment.Payment.getPaymentType().getPaymentPrice())
        java.lang.Double _asResult_sredniaCenaPrzesylki = _avgResult;
        //visitAsExpression - end  avg(Shipment.Payment.getPaymentType().getPaymentPrice()) as sredniaCenaPrzesylki
        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_asResult_sredniaCenaPrzesylki,
            ocb);

        return _asResult_sredniaCenaPrzesylki;

        //evaluateExpression - end  avg(Shipment.Payment.getPaymentType().getPaymentPrice()) as sredniaCenaPrzesylki
    }
}
