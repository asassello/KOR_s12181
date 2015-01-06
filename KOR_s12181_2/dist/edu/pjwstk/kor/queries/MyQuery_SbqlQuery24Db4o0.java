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


public class MyQuery_SbqlQuery24Db4o0 implements Db4oSBQLQuery<java.lang.Double> {
    public MyQuery_SbqlQuery24Db4o0() {
    }

    /**
     * query='dataBase.(0.0 +  avg(Shipment.getFullDaysOfDelivery()))'
    '
     **/
    public java.lang.Double executeQuery(final ObjectContainerBase ocb,
        final Transaction t) {
        //evaluateExpression - start 0.0 +  avg(Shipment.getFullDaysOfDelivery())
        final LocalTransaction transLocal = (LocalTransaction) t;

        //visitBinaryAExpression - start 0.0 +  avg(Shipment.getFullDaysOfDelivery())
        //visitLiteralExpression - start 0.0
        //visitLiteralExpression - end 0.0
        //visitUnaryExpression - start  avg(Shipment.getFullDaysOfDelivery())
        //visitDotExpression - start Shipment.getFullDaysOfDelivery()
        //visitIdentifierExpression - start Shipment
        final java.util.Collection<edu.pjwstk.kor.model.Shipment> _ident_Shipment =
            new java.util.ArrayList<edu.pjwstk.kor.model.Shipment>();
        ClassMetadata _classMeta35 = ocb.classCollection()
                                        .getClassMetadata("edu.pjwstk.kor.model.Shipment");
        long[] _ids35 = _classMeta35.getIDs(transLocal);

        for (long _id35 : _ids35) {
            LazyObjectReference _ref35 = transLocal.lazyReferenceFor((int) _id35);
            _ident_Shipment.add((edu.pjwstk.kor.model.Shipment) _ref35.getObject());
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
            Number _avgSum4 = null;

            for (Number _avgEl4 : _dotResult) {
                _avgSum4 = MathUtils.sum(_avgSum4, _avgEl4);
            }

            _avgResult = _avgSum4.doubleValue() / _dotResult.size();
        }

        //OperatorAvg - end  avg(Shipment.getFullDaysOfDelivery())
        //visitUnaryExpression - end  avg(Shipment.getFullDaysOfDelivery())
        //OperatorPlus - start 0.0 +  avg(Shipment.getFullDaysOfDelivery())
        java.lang.Double _plusResult = 0.0 + _avgResult;
        //OperatorPlus - end 0.0 +  avg(Shipment.getFullDaysOfDelivery())
        //visitBinaryAExpression - end 0.0 +  avg(Shipment.getFullDaysOfDelivery())
        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_plusResult, ocb);

        return _plusResult;

        //evaluateExpression - end 0.0 +  avg(Shipment.getFullDaysOfDelivery())
    }
}
