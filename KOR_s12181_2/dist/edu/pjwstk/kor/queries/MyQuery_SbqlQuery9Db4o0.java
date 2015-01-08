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


public class MyQuery_SbqlQuery9Db4o0 implements Db4oSBQLQuery<java.lang.Double> {
    public MyQuery_SbqlQuery9Db4o0() {
    }

    /**
     * query='dataBase.( avg(Shipment.Packagement.PaymentType.getPaymentPrice()) as sredniaCenaPaczki)'
    '
     **/
    public java.lang.Double executeQuery(final ObjectContainerBase ocb,
        final Transaction t) {
        //evaluateExpression - start  avg(Shipment.Packagement.PaymentType.getPaymentPrice()) as sredniaCenaPaczki
        final LocalTransaction transLocal = (LocalTransaction) t;

        //visitAsExpression - start  avg(Shipment.Packagement.PaymentType.getPaymentPrice()) as sredniaCenaPaczki
        //visitUnaryExpression - start  avg(Shipment.Packagement.PaymentType.getPaymentPrice())
        //visitDotExpression - start Shipment.Packagement.PaymentType.getPaymentPrice()
        //visitDotExpression - start Shipment.Packagement.PaymentType
        //visitDotExpression - start Shipment.Packagement
        //visitIdentifierExpression - start Shipment
        final java.util.Collection<edu.pjwstk.kor.model.Shipment> _ident_Shipment =
            new java.util.ArrayList<edu.pjwstk.kor.model.Shipment>();
        ClassMetadata _classMeta15 = ocb.classCollection()
                                        .getClassMetadata("edu.pjwstk.kor.model.Shipment");
        long[] _ids15 = _classMeta15.getIDs(transLocal);

        for (long _id15 : _ids15) {
            LazyObjectReference _ref15 = transLocal.lazyReferenceFor((int) _id15);
            _ident_Shipment.add((edu.pjwstk.kor.model.Shipment) _ref15.getObject());
        }

        //visitIdentifierExpression - end Shipment
        java.util.Collection<edu.pjwstk.kor.model.Packagement> _dotResult = new java.util.ArrayList<edu.pjwstk.kor.model.Packagement>();
        int _dotIndex = 0;

        for (edu.pjwstk.kor.model.Shipment _dotEl : _ident_Shipment) {
            if (_dotEl == null) {
                continue;
            }

            if (_dotEl != null) {
                ocb.activate(_dotEl, 1);
            }

            //visitIdentifierExpression - start Packagement
            final java.util.Collection<edu.pjwstk.kor.model.Packagement> _ident_Packagement =
                new java.util.ArrayList<edu.pjwstk.kor.model.Packagement>();
            ClassMetadata _classMeta16 = ocb.classCollection()
                                            .getClassMetadata("edu.pjwstk.kor.model.Packagement");
            long[] _ids16 = _classMeta16.getIDs(transLocal);

            for (long _id16 : _ids16) {
                LazyObjectReference _ref16 = transLocal.lazyReferenceFor((int) _id16);
                _ident_Packagement.add((edu.pjwstk.kor.model.Packagement) _ref16.getObject());
            }

            //visitIdentifierExpression - end Packagement
            if (_ident_Packagement != null) {
                ocb.activate(_ident_Packagement, 2);
            }

            _dotResult.addAll(_ident_Packagement);
            _dotIndex++;
        }

        //visitDotExpression - end Shipment.Packagement
        java.util.Collection<edu.pjwstk.kor.model.PaymentType> _dotResult1 = new java.util.ArrayList<edu.pjwstk.kor.model.PaymentType>();
        int _dotIndex1 = 0;

        for (edu.pjwstk.kor.model.Packagement _dotEl1 : _dotResult) {
            if (_dotEl1 == null) {
                continue;
            }

            if (_dotEl1 != null) {
                ocb.activate(_dotEl1, 1);
            }

            //visitIdentifierExpression - start PaymentType
            final java.util.Collection<edu.pjwstk.kor.model.PaymentType> _ident_PaymentType =
                new java.util.ArrayList<edu.pjwstk.kor.model.PaymentType>();
            ClassMetadata _classMeta17 = ocb.classCollection()
                                            .getClassMetadata("edu.pjwstk.kor.model.PaymentType");
            long[] _ids17 = _classMeta17.getIDs(transLocal);

            for (long _id17 : _ids17) {
                LazyObjectReference _ref17 = transLocal.lazyReferenceFor((int) _id17);
                _ident_PaymentType.add((edu.pjwstk.kor.model.PaymentType) _ref17.getObject());
            }

            //visitIdentifierExpression - end PaymentType
            if (_ident_PaymentType != null) {
                ocb.activate(_ident_PaymentType, 2);
            }

            _dotResult1.addAll(_ident_PaymentType);
            _dotIndex1++;
        }

        //visitDotExpression - end Shipment.Packagement.PaymentType
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

        //visitDotExpression - end Shipment.Packagement.PaymentType.getPaymentPrice()
        //OperatorAvg - start  avg(Shipment.Packagement.PaymentType.getPaymentPrice())
        java.lang.Double _avgResult = 0d;

        if ((_dotResult2 != null) && !_dotResult2.isEmpty()) {
            Number _avgSum2 = null;

            for (Number _avgEl2 : _dotResult2) {
                _avgSum2 = MathUtils.sum(_avgSum2, _avgEl2);
            }

            _avgResult = _avgSum2.doubleValue() / _dotResult2.size();
        }

        //OperatorAvg - end  avg(Shipment.Packagement.PaymentType.getPaymentPrice())
        //visitUnaryExpression - end  avg(Shipment.Packagement.PaymentType.getPaymentPrice())
        java.lang.Double _asResult_sredniaCenaPaczki = _avgResult;
        //visitAsExpression - end  avg(Shipment.Packagement.PaymentType.getPaymentPrice()) as sredniaCenaPaczki
        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_asResult_sredniaCenaPaczki,
            ocb);

        return _asResult_sredniaCenaPaczki;

        //evaluateExpression - end  avg(Shipment.Packagement.PaymentType.getPaymentPrice()) as sredniaCenaPaczki
    }
}
