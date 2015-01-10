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


public class MyQuery_SbqlQuery53Db4o0 implements Db4oSBQLQuery<pl.wcislo.sbql4j.java.model.runtime.Struct> {
    public MyQuery_SbqlQuery53Db4o0() {
    }

    /**
     * query='dataBase.((0.0 +  avg(Shipment.getFullDaysOfDelivery())) as wartoscSrednia, (0.0 +  min(Shipment.getFullDaysOfDelivery())) as wartoscMinimalna, (0.0 +  max(Shipment.getFullDaysOfDelivery())) as wartoscMaksymalna)'
    '
     **/
    public pl.wcislo.sbql4j.java.model.runtime.Struct executeQuery(
        final ObjectContainerBase ocb, final Transaction t) {
        //evaluateExpression - start (0.0 +  avg(Shipment.getFullDaysOfDelivery())) as wartoscSrednia, (0.0 +  min(Shipment.getFullDaysOfDelivery())) as wartoscMinimalna, (0.0 +  max(Shipment.getFullDaysOfDelivery())) as wartoscMaksymalna
        final LocalTransaction transLocal = (LocalTransaction) t;

        //visitCommaExpression - start (0.0 +  avg(Shipment.getFullDaysOfDelivery())) as wartoscSrednia, (0.0 +  min(Shipment.getFullDaysOfDelivery())) as wartoscMinimalna, (0.0 +  max(Shipment.getFullDaysOfDelivery())) as wartoscMaksymalna
        //visitCommaExpression - start (0.0 +  avg(Shipment.getFullDaysOfDelivery())) as wartoscSrednia, (0.0 +  min(Shipment.getFullDaysOfDelivery())) as wartoscMinimalna
        //visitAsExpression - start (0.0 +  avg(Shipment.getFullDaysOfDelivery())) as wartoscSrednia
        //visitBinaryAExpression - start 0.0 +  avg(Shipment.getFullDaysOfDelivery())
        //visitLiteralExpression - start 0.0
        //visitLiteralExpression - end 0.0
        //visitUnaryExpression - start  avg(Shipment.getFullDaysOfDelivery())
        //visitDotExpression - start Shipment.getFullDaysOfDelivery()
        //visitIdentifierExpression - start Shipment
        final java.util.Collection<edu.pjwstk.kor.model.Shipment> _ident_Shipment =
            new java.util.ArrayList<edu.pjwstk.kor.model.Shipment>();
        ClassMetadata _classMeta72 = ocb.classCollection()
                                        .getClassMetadata("edu.pjwstk.kor.model.Shipment");
        long[] _ids72 = _classMeta72.getIDs(transLocal);

        for (long _id72 : _ids72) {
            LazyObjectReference _ref72 = transLocal.lazyReferenceFor((int) _id72);
            _ident_Shipment.add((edu.pjwstk.kor.model.Shipment) _ref72.getObject());
        }

        //visitIdentifierExpression - end Shipment
        java.util.Collection<java.lang.Integer> _dotResult = new java.util.ArrayList<java.lang.Integer>();
        int _dotIndex = 0;

        for (edu.pjwstk.kor.model.Shipment _dotEl : _ident_Shipment) {
            if (_dotEl == null) {
                continue;
            }

            if (_dotEl != null) {
                ocb.activate(_dotEl, 1);
            }

            //visitMethodExpression - start getFullDaysOfDelivery()
            java.lang.Integer _mth_getFullDaysOfDeliveryResult = _dotEl.getFullDaysOfDelivery();

            if (_mth_getFullDaysOfDeliveryResult != null) {
                ocb.activate(_mth_getFullDaysOfDeliveryResult, 1);
            }

            //visitMethodExpression - end getFullDaysOfDelivery()
            if (_mth_getFullDaysOfDeliveryResult != null) {
                ocb.activate(_mth_getFullDaysOfDeliveryResult, 1);
            }

            _dotResult.add(_mth_getFullDaysOfDeliveryResult);
            _dotIndex++;
        }

        //visitDotExpression - end Shipment.getFullDaysOfDelivery()
        //OperatorAvg - start  avg(Shipment.getFullDaysOfDelivery())
        java.lang.Double _avgResult = 0d;

        if ((_dotResult != null) && !_dotResult.isEmpty()) {
            Number _avgSum7 = null;

            for (Number _avgEl7 : _dotResult) {
                _avgSum7 = MathUtils.sum(_avgSum7, _avgEl7);
            }

            _avgResult = _avgSum7.doubleValue() / _dotResult.size();
        }

        //OperatorAvg - end  avg(Shipment.getFullDaysOfDelivery())
        //visitUnaryExpression - end  avg(Shipment.getFullDaysOfDelivery())
        //OperatorPlus - start 0.0 +  avg(Shipment.getFullDaysOfDelivery())
        java.lang.Double _plusResult = 0.0 + _avgResult;

        //OperatorPlus - end 0.0 +  avg(Shipment.getFullDaysOfDelivery())
        //visitBinaryAExpression - end 0.0 +  avg(Shipment.getFullDaysOfDelivery())
        java.lang.Double _asResult_wartoscSrednia = _plusResult;

        //visitAsExpression - end (0.0 +  avg(Shipment.getFullDaysOfDelivery())) as wartoscSrednia
        //visitAsExpression - start (0.0 +  min(Shipment.getFullDaysOfDelivery())) as wartoscMinimalna
        //visitBinaryAExpression - start 0.0 +  min(Shipment.getFullDaysOfDelivery())
        //visitLiteralExpression - start 0.0
        //visitLiteralExpression - end 0.0
        //visitUnaryExpression - start  min(Shipment.getFullDaysOfDelivery())
        //visitDotExpression - start Shipment.getFullDaysOfDelivery()
        //visitIdentifierExpression - start Shipment
        final java.util.Collection<edu.pjwstk.kor.model.Shipment> _ident_Shipment1 =
            new java.util.ArrayList<edu.pjwstk.kor.model.Shipment>();
        ClassMetadata _classMeta73 = ocb.classCollection()
                                        .getClassMetadata("edu.pjwstk.kor.model.Shipment");
        long[] _ids73 = _classMeta73.getIDs(transLocal);

        for (long _id73 : _ids73) {
            LazyObjectReference _ref73 = transLocal.lazyReferenceFor((int) _id73);
            _ident_Shipment1.add((edu.pjwstk.kor.model.Shipment) _ref73.getObject());
        }

        //visitIdentifierExpression - end Shipment
        java.util.Collection<java.lang.Integer> _dotResult1 = new java.util.ArrayList<java.lang.Integer>();
        int _dotIndex1 = 0;

        for (edu.pjwstk.kor.model.Shipment _dotEl1 : _ident_Shipment1) {
            if (_dotEl1 == null) {
                continue;
            }

            if (_dotEl1 != null) {
                ocb.activate(_dotEl1, 1);
            }

            //visitMethodExpression - start getFullDaysOfDelivery()
            java.lang.Integer _mth_getFullDaysOfDeliveryResult1 = _dotEl1.getFullDaysOfDelivery();

            if (_mth_getFullDaysOfDeliveryResult1 != null) {
                ocb.activate(_mth_getFullDaysOfDeliveryResult1, 1);
            }

            //visitMethodExpression - end getFullDaysOfDelivery()
            if (_mth_getFullDaysOfDeliveryResult1 != null) {
                ocb.activate(_mth_getFullDaysOfDeliveryResult1, 1);
            }

            _dotResult1.add(_mth_getFullDaysOfDeliveryResult1);
            _dotIndex1++;
        }

        //visitDotExpression - end Shipment.getFullDaysOfDelivery()
        //OperatorMin - start  min(Shipment.getFullDaysOfDelivery())
        Number _min1 = null;

        for (Number _minEl1 : _dotResult1) {
            _min1 = MathUtils.min(_min1, _minEl1);
        }

        java.lang.Integer _minResult = (java.lang.Integer) _min1;

        //OperatorMin - end  min(Shipment.getFullDaysOfDelivery())
        //visitUnaryExpression - end  min(Shipment.getFullDaysOfDelivery())
        //OperatorPlus - start 0.0 +  min(Shipment.getFullDaysOfDelivery())
        java.lang.Double _plusResult1 = 0.0 + _minResult;

        //OperatorPlus - end 0.0 +  min(Shipment.getFullDaysOfDelivery())
        //visitBinaryAExpression - end 0.0 +  min(Shipment.getFullDaysOfDelivery())
        java.lang.Double _asResult_wartoscMinimalna = _plusResult1;

        //visitAsExpression - end (0.0 +  min(Shipment.getFullDaysOfDelivery())) as wartoscMinimalna
        //OperatorComma - start (0.0 +  avg(Shipment.getFullDaysOfDelivery())) as wartoscSrednia, (0.0 +  min(Shipment.getFullDaysOfDelivery())) as wartoscMinimalna
        pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult = OperatorUtils.cartesianProductSS(_asResult_wartoscSrednia,
                _asResult_wartoscMinimalna, "wartoscSrednia", "wartoscMinimalna");

        //OperatorComma - end (0.0 +  avg(Shipment.getFullDaysOfDelivery())) as wartoscSrednia, (0.0 +  min(Shipment.getFullDaysOfDelivery())) as wartoscMinimalna
        //visitCommaExpression - end (0.0 +  avg(Shipment.getFullDaysOfDelivery())) as wartoscSrednia, (0.0 +  min(Shipment.getFullDaysOfDelivery())) as wartoscMinimalna
        //visitAsExpression - start (0.0 +  max(Shipment.getFullDaysOfDelivery())) as wartoscMaksymalna
        //visitBinaryAExpression - start 0.0 +  max(Shipment.getFullDaysOfDelivery())
        //visitLiteralExpression - start 0.0
        //visitLiteralExpression - end 0.0
        //visitUnaryExpression - start  max(Shipment.getFullDaysOfDelivery())
        //visitDotExpression - start Shipment.getFullDaysOfDelivery()
        //visitIdentifierExpression - start Shipment
        final java.util.Collection<edu.pjwstk.kor.model.Shipment> _ident_Shipment2 =
            new java.util.ArrayList<edu.pjwstk.kor.model.Shipment>();
        ClassMetadata _classMeta74 = ocb.classCollection()
                                        .getClassMetadata("edu.pjwstk.kor.model.Shipment");
        long[] _ids74 = _classMeta74.getIDs(transLocal);

        for (long _id74 : _ids74) {
            LazyObjectReference _ref74 = transLocal.lazyReferenceFor((int) _id74);
            _ident_Shipment2.add((edu.pjwstk.kor.model.Shipment) _ref74.getObject());
        }

        //visitIdentifierExpression - end Shipment
        java.util.Collection<java.lang.Integer> _dotResult2 = new java.util.ArrayList<java.lang.Integer>();
        int _dotIndex2 = 0;

        for (edu.pjwstk.kor.model.Shipment _dotEl2 : _ident_Shipment2) {
            if (_dotEl2 == null) {
                continue;
            }

            if (_dotEl2 != null) {
                ocb.activate(_dotEl2, 1);
            }

            //visitMethodExpression - start getFullDaysOfDelivery()
            java.lang.Integer _mth_getFullDaysOfDeliveryResult2 = _dotEl2.getFullDaysOfDelivery();

            if (_mth_getFullDaysOfDeliveryResult2 != null) {
                ocb.activate(_mth_getFullDaysOfDeliveryResult2, 1);
            }

            //visitMethodExpression - end getFullDaysOfDelivery()
            if (_mth_getFullDaysOfDeliveryResult2 != null) {
                ocb.activate(_mth_getFullDaysOfDeliveryResult2, 1);
            }

            _dotResult2.add(_mth_getFullDaysOfDeliveryResult2);
            _dotIndex2++;
        }

        //visitDotExpression - end Shipment.getFullDaysOfDelivery()
        //OperatorMax - start  max(Shipment.getFullDaysOfDelivery())
        Number _max1 = null;

        for (Number _maxEl1 : _dotResult2) {
            _max1 = MathUtils.max(_max1, _maxEl1);
        }

        java.lang.Integer _maxResult = (java.lang.Integer) _max1;

        //OperatorMax - end  max(Shipment.getFullDaysOfDelivery())
        //visitUnaryExpression - end  max(Shipment.getFullDaysOfDelivery())
        //OperatorPlus - start 0.0 +  max(Shipment.getFullDaysOfDelivery())
        java.lang.Double _plusResult2 = 0.0 + _maxResult;

        //OperatorPlus - end 0.0 +  max(Shipment.getFullDaysOfDelivery())
        //visitBinaryAExpression - end 0.0 +  max(Shipment.getFullDaysOfDelivery())
        java.lang.Double _asResult_wartoscMaksymalna = _plusResult2;

        //visitAsExpression - end (0.0 +  max(Shipment.getFullDaysOfDelivery())) as wartoscMaksymalna
        //OperatorComma - start (0.0 +  avg(Shipment.getFullDaysOfDelivery())) as wartoscSrednia, (0.0 +  min(Shipment.getFullDaysOfDelivery())) as wartoscMinimalna, (0.0 +  max(Shipment.getFullDaysOfDelivery())) as wartoscMaksymalna
        pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult1 = OperatorUtils.cartesianProductSS(_commaResult,
                _asResult_wartoscMaksymalna, "", "wartoscMaksymalna");
        //OperatorComma - end (0.0 +  avg(Shipment.getFullDaysOfDelivery())) as wartoscSrednia, (0.0 +  min(Shipment.getFullDaysOfDelivery())) as wartoscMinimalna, (0.0 +  max(Shipment.getFullDaysOfDelivery())) as wartoscMaksymalna
        //visitCommaExpression - end (0.0 +  avg(Shipment.getFullDaysOfDelivery())) as wartoscSrednia, (0.0 +  min(Shipment.getFullDaysOfDelivery())) as wartoscMinimalna, (0.0 +  max(Shipment.getFullDaysOfDelivery())) as wartoscMaksymalna
        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_commaResult1, ocb);

        return _commaResult1;

        //evaluateExpression - end (0.0 +  avg(Shipment.getFullDaysOfDelivery())) as wartoscSrednia, (0.0 +  min(Shipment.getFullDaysOfDelivery())) as wartoscMinimalna, (0.0 +  max(Shipment.getFullDaysOfDelivery())) as wartoscMaksymalna
    }
}
