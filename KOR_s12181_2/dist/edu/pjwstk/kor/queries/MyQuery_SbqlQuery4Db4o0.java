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


public class MyQuery_SbqlQuery4Db4o0 implements Db4oSBQLQuery<java.lang.Integer> {
    public MyQuery_SbqlQuery4Db4o0() {
    }

    /**
     * query='dataBase.( count((Shipment as sh where sh.getEmplyReceiving().getIsTemporary() == false || sh.getEmplyDelivering().getIsTemporary() == false)) as iloscObsluzonychPrzezStalych)'
    '
     **/
    public java.lang.Integer executeQuery(final ObjectContainerBase ocb,
        final Transaction t) {
        //evaluateExpression - start  count((Shipment as sh where sh.getEmplyReceiving().getIsTemporary() == false || sh.getEmplyDelivering().getIsTemporary() == false)) as iloscObsluzonychPrzezStalych
        final LocalTransaction transLocal = (LocalTransaction) t;

        //visitAsExpression - start  count((Shipment as sh where sh.getEmplyReceiving().getIsTemporary() == false || sh.getEmplyDelivering().getIsTemporary() == false)) as iloscObsluzonychPrzezStalych
        //visitUnaryExpression - start  count((Shipment as sh where sh.getEmplyReceiving().getIsTemporary() == false || sh.getEmplyDelivering().getIsTemporary() == false))
        //visitWhereExpression - start Shipment as sh where sh.getEmplyReceiving().getIsTemporary() == false || sh.getEmplyDelivering().getIsTemporary() == false
        //visitAsExpression - start Shipment as sh
        //visitIdentifierExpression - start Shipment
        final java.util.Collection<edu.pjwstk.kor.model.Shipment> _ident_Shipment =
            new java.util.ArrayList<edu.pjwstk.kor.model.Shipment>();
        ClassMetadata _classMeta7 = ocb.classCollection()
                                       .getClassMetadata("edu.pjwstk.kor.model.Shipment");
        long[] _ids7 = _classMeta7.getIDs(transLocal);

        for (long _id7 : _ids7) {
            LazyObjectReference _ref7 = transLocal.lazyReferenceFor((int) _id7);
            _ident_Shipment.add((edu.pjwstk.kor.model.Shipment) _ref7.getObject());
        }

        //visitIdentifierExpression - end Shipment
        java.util.Collection<edu.pjwstk.kor.model.Shipment> _asResult_sh = _ident_Shipment;

        //visitAsExpression - end Shipment as sh
        java.util.Collection<edu.pjwstk.kor.model.Shipment> _whereResult = new java.util.ArrayList<edu.pjwstk.kor.model.Shipment>();
        int _whereLoopIndex = 0;

        for (edu.pjwstk.kor.model.Shipment _whereEl : _asResult_sh) {
            if (_whereEl == null) {
                continue;
            }

            if (_whereEl != null) {
                ocb.activate(_whereEl, 1);
            }

            //visitBinaryAExpression - start sh.getEmplyReceiving().getIsTemporary() == false || sh.getEmplyDelivering().getIsTemporary() == false
            //OperatorOr - start sh.getEmplyReceiving().getIsTemporary() == false || sh.getEmplyDelivering().getIsTemporary() == false
            //visitBinaryAExpression - start sh.getEmplyReceiving().getIsTemporary() == false
            //visitDotExpression - start sh.getEmplyReceiving().getIsTemporary()
            //visitDotExpression - start sh.getEmplyReceiving()
            //visitIdentifierExpression - start sh
            edu.pjwstk.kor.model.Shipment _ident_sh = _whereEl;

            if (_ident_sh != null) {
                ocb.activate(_ident_sh, 1);
            }

            //visitIdentifierExpression - end sh
            edu.pjwstk.kor.model.Shipment _dotEl = _ident_sh;

            if (_ident_sh != null) {
                ocb.activate(_ident_sh, 2);
            }

            //visitMethodExpression - start getEmplyReceiving()
            edu.pjwstk.kor.model.Employee _mth_getEmplyReceivingResult = _dotEl.getEmplyReceiving();

            if (_mth_getEmplyReceivingResult != null) {
                ocb.activate(_mth_getEmplyReceivingResult, 1);
            }

            //visitMethodExpression - end getEmplyReceiving()
            //visitDotExpression - end sh.getEmplyReceiving()
            edu.pjwstk.kor.model.Employee _dotEl1 = _mth_getEmplyReceivingResult;

            if (_mth_getEmplyReceivingResult != null) {
                ocb.activate(_mth_getEmplyReceivingResult, 2);
            }

            //visitMethodExpression - start getIsTemporary()
            java.lang.Boolean _mth_getIsTemporaryResult = _dotEl1.getIsTemporary();

            if (_mth_getIsTemporaryResult != null) {
                ocb.activate(_mth_getIsTemporaryResult, 1);
            }

            //visitMethodExpression - end getIsTemporary()
            //visitDotExpression - end sh.getEmplyReceiving().getIsTemporary()
            //visitLiteralExpression - start false
            //visitLiteralExpression - end false
            //OperatorEquals - start sh.getEmplyReceiving().getIsTemporary() == false
            java.lang.Boolean _equalsResult = OperatorUtils.equalsSafe(_mth_getIsTemporaryResult,
                    false);

            //OperatorEquals - end sh.getEmplyReceiving().getIsTemporary() == false
            //visitBinaryAExpression - end sh.getEmplyReceiving().getIsTemporary() == false
            java.lang.Boolean _orResult;

            if (!_equalsResult) {
                _orResult = true;
            } else {
                //visitBinaryAExpression - start sh.getEmplyDelivering().getIsTemporary() == false
                //visitDotExpression - start sh.getEmplyDelivering().getIsTemporary()
                //visitDotExpression - start sh.getEmplyDelivering()
                //visitIdentifierExpression - start sh
                edu.pjwstk.kor.model.Shipment _ident_sh1 = _whereEl;

                if (_ident_sh1 != null) {
                    ocb.activate(_ident_sh1, 1);
                }

                //visitIdentifierExpression - end sh
                edu.pjwstk.kor.model.Shipment _dotEl2 = _ident_sh1;

                if (_ident_sh1 != null) {
                    ocb.activate(_ident_sh1, 2);
                }

                //visitMethodExpression - start getEmplyDelivering()
                edu.pjwstk.kor.model.Employee _mth_getEmplyDeliveringResult = _dotEl2.getEmplyDelivering();

                if (_mth_getEmplyDeliveringResult != null) {
                    ocb.activate(_mth_getEmplyDeliveringResult, 1);
                }

                //visitMethodExpression - end getEmplyDelivering()
                //visitDotExpression - end sh.getEmplyDelivering()
                edu.pjwstk.kor.model.Employee _dotEl3 = _mth_getEmplyDeliveringResult;

                if (_mth_getEmplyDeliveringResult != null) {
                    ocb.activate(_mth_getEmplyDeliveringResult, 2);
                }

                //visitMethodExpression - start getIsTemporary()
                java.lang.Boolean _mth_getIsTemporaryResult1 = _dotEl3.getIsTemporary();

                if (_mth_getIsTemporaryResult1 != null) {
                    ocb.activate(_mth_getIsTemporaryResult1, 1);
                }

                //visitMethodExpression - end getIsTemporary()
                //visitDotExpression - end sh.getEmplyDelivering().getIsTemporary()
                //visitLiteralExpression - start false
                //visitLiteralExpression - end false
                //OperatorEquals - start sh.getEmplyDelivering().getIsTemporary() == false
                java.lang.Boolean _equalsResult1 = OperatorUtils.equalsSafe(_mth_getIsTemporaryResult1,
                        false);
                //OperatorEquals - end sh.getEmplyDelivering().getIsTemporary() == false
                //visitBinaryAExpression - end sh.getEmplyDelivering().getIsTemporary() == false
                _orResult = _equalsResult1;
            }

            //OperatorOr - end sh.getEmplyReceiving().getIsTemporary() == false || sh.getEmplyDelivering().getIsTemporary() == false
            //visitBinaryAExpression - end sh.getEmplyReceiving().getIsTemporary() == false || sh.getEmplyDelivering().getIsTemporary() == false
            if (_orResult) {
                _whereResult.add(_whereEl);
            }

            _whereLoopIndex++;
        }

        //visitWhereExpression - end Shipment as sh where sh.getEmplyReceiving().getIsTemporary() == false || sh.getEmplyDelivering().getIsTemporary() == false
        //OperatorCount - start  count((Shipment as sh where sh.getEmplyReceiving().getIsTemporary() == false || sh.getEmplyDelivering().getIsTemporary() == false))
        java.lang.Integer _countResult = _whereResult.size();

        //OperatorCount - end  count((Shipment as sh where sh.getEmplyReceiving().getIsTemporary() == false || sh.getEmplyDelivering().getIsTemporary() == false))
        //visitUnaryExpression - end  count((Shipment as sh where sh.getEmplyReceiving().getIsTemporary() == false || sh.getEmplyDelivering().getIsTemporary() == false))
        java.lang.Integer _asResult_iloscObsluzonychPrzezStalych = _countResult;
        //visitAsExpression - end  count((Shipment as sh where sh.getEmplyReceiving().getIsTemporary() == false || sh.getEmplyDelivering().getIsTemporary() == false)) as iloscObsluzonychPrzezStalych
        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_asResult_iloscObsluzonychPrzezStalych,
            ocb);

        return _asResult_iloscObsluzonychPrzezStalych;

        //evaluateExpression - end  count((Shipment as sh where sh.getEmplyReceiving().getIsTemporary() == false || sh.getEmplyDelivering().getIsTemporary() == false)) as iloscObsluzonychPrzezStalych
    }
}
