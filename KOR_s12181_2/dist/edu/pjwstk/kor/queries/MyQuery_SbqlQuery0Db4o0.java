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


public class MyQuery_SbqlQuery0Db4o0 implements Db4oSBQLQuery<java.lang.Double> {
    public MyQuery_SbqlQuery0Db4o0() {
    }

    /**
     * query='dataBase.( avg(Shipment.Packagement.getWeight()) as SredniaWagaPaczki)'
    '
     **/
    public java.lang.Double executeQuery(final ObjectContainerBase ocb,
        final Transaction t) {
        //evaluateExpression - start  avg(Shipment.Packagement.getWeight()) as SredniaWagaPaczki
        final LocalTransaction transLocal = (LocalTransaction) t;

        //visitAsExpression - start  avg(Shipment.Packagement.getWeight()) as SredniaWagaPaczki
        //visitUnaryExpression - start  avg(Shipment.Packagement.getWeight())
        //visitDotExpression - start Shipment.Packagement.getWeight()
        //visitDotExpression - start Shipment.Packagement
        //visitIdentifierExpression - start Shipment
        final java.util.Collection<edu.pjwstk.kor.model.Shipment> _ident_Shipment =
            new java.util.ArrayList<edu.pjwstk.kor.model.Shipment>();
        ClassMetadata _classMeta0 = ocb.classCollection()
                                       .getClassMetadata("edu.pjwstk.kor.model.Shipment");
        long[] _ids0 = _classMeta0.getIDs(transLocal);

        for (long _id0 : _ids0) {
            LazyObjectReference _ref0 = transLocal.lazyReferenceFor((int) _id0);
            _ident_Shipment.add((edu.pjwstk.kor.model.Shipment) _ref0.getObject());
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
            ClassMetadata _classMeta1 = ocb.classCollection()
                                           .getClassMetadata("edu.pjwstk.kor.model.Packagement");
            long[] _ids1 = _classMeta1.getIDs(transLocal);

            for (long _id1 : _ids1) {
                LazyObjectReference _ref1 = transLocal.lazyReferenceFor((int) _id1);
                _ident_Packagement.add((edu.pjwstk.kor.model.Packagement) _ref1.getObject());
            }

            //visitIdentifierExpression - end Packagement
            if (_ident_Packagement != null) {
                ocb.activate(_ident_Packagement, 2);
            }

            _dotResult.addAll(_ident_Packagement);
            _dotIndex++;
        }

        //visitDotExpression - end Shipment.Packagement
        java.util.Collection<java.lang.Double> _dotResult1 = new java.util.ArrayList<java.lang.Double>();
        int _dotIndex1 = 0;

        for (edu.pjwstk.kor.model.Packagement _dotEl1 : _dotResult) {
            if (_dotEl1 == null) {
                continue;
            }

            if (_dotEl1 != null) {
                ocb.activate(_dotEl1, 1);
            }

            //visitMethodExpression - start getWeight()
            java.lang.Double _mth_getWeightResult = _dotEl1.getWeight();

            if (_mth_getWeightResult != null) {
                ocb.activate(_mth_getWeightResult, 1);
            }

            //visitMethodExpression - end getWeight()
            if (_mth_getWeightResult != null) {
                ocb.activate(_mth_getWeightResult, 1);
            }

            _dotResult1.add(_mth_getWeightResult);
            _dotIndex1++;
        }

        //visitDotExpression - end Shipment.Packagement.getWeight()
        //OperatorAvg - start  avg(Shipment.Packagement.getWeight())
        java.lang.Double _avgResult = 0d;

        if ((_dotResult1 != null) && !_dotResult1.isEmpty()) {
            Number _avgSum0 = null;

            for (Number _avgEl0 : _dotResult1) {
                _avgSum0 = MathUtils.sum(_avgSum0, _avgEl0);
            }

            _avgResult = _avgSum0.doubleValue() / _dotResult1.size();
        }

        //OperatorAvg - end  avg(Shipment.Packagement.getWeight())
        //visitUnaryExpression - end  avg(Shipment.Packagement.getWeight())
        java.lang.Double _asResult_SredniaWagaPaczki = _avgResult;
        //visitAsExpression - end  avg(Shipment.Packagement.getWeight()) as SredniaWagaPaczki
        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_asResult_SredniaWagaPaczki,
            ocb);

        return _asResult_SredniaWagaPaczki;

        //evaluateExpression - end  avg(Shipment.Packagement.getWeight()) as SredniaWagaPaczki
    }
}
