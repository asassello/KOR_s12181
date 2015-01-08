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


public class MyQuery_SbqlQuery17Db4o0 implements Db4oSBQLQuery<java.lang.Integer> {
    public MyQuery_SbqlQuery17Db4o0() {
    }

    /**
     * query='dataBase.( count((Shipment as sh where sh.size() == 4).sh.size()))'
    '
     **/
    public java.lang.Integer executeQuery(final ObjectContainerBase ocb,
        final Transaction t) {
        //evaluateExpression - start  count((Shipment as sh where sh.size() == 4).sh.size())
        final LocalTransaction transLocal = (LocalTransaction) t;

        //visitUnaryExpression - start  count((Shipment as sh where sh.size() == 4).sh.size())
        //visitDotExpression - start (Shipment as sh where sh.size() == 4).sh.size()
        //visitWhereExpression - start Shipment as sh where sh.size() == 4
        //visitAsExpression - start Shipment as sh
        //visitIdentifierExpression - start Shipment
        final java.util.Collection<edu.pjwstk.kor.model.Shipment> _ident_Shipment =
            new java.util.ArrayList<edu.pjwstk.kor.model.Shipment>();
        ClassMetadata _classMeta28 = ocb.classCollection()
                                        .getClassMetadata("edu.pjwstk.kor.model.Shipment");
        long[] _ids28 = _classMeta28.getIDs(transLocal);

        for (long _id28 : _ids28) {
            LazyObjectReference _ref28 = transLocal.lazyReferenceFor((int) _id28);
            _ident_Shipment.add((edu.pjwstk.kor.model.Shipment) _ref28.getObject());
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

            //visitBinaryAExpression - start sh.size() == 4
            //visitDotExpression - start sh.size()
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

            //visitMethodExpression - start size()
            java.lang.Integer _mth_sizeResult = _dotEl.size();

            if (_mth_sizeResult != null) {
                ocb.activate(_mth_sizeResult, 1);
            }

            //visitMethodExpression - end size()
            //visitDotExpression - end sh.size()
            //visitLiteralExpression - start 4
            //visitLiteralExpression - end 4
            //OperatorEquals - start sh.size() == 4
            java.lang.Boolean _equalsResult = OperatorUtils.equalsSafe(_mth_sizeResult,
                    4);

            //OperatorEquals - end sh.size() == 4
            //visitBinaryAExpression - end sh.size() == 4
            if (_equalsResult) {
                _whereResult.add(_whereEl);
            }

            _whereLoopIndex++;
        }

        //visitWhereExpression - end Shipment as sh where sh.size() == 4
        java.util.Collection<java.lang.Integer> _dotResult2 = new java.util.ArrayList<java.lang.Integer>();
        int _dotIndex2 = 0;

        for (edu.pjwstk.kor.model.Shipment _dotEl2 : _whereResult) {
            if (_dotEl2 == null) {
                continue;
            }

            if (_dotEl2 != null) {
                ocb.activate(_dotEl2, 1);
            }

            //visitDotExpression - start sh.size()
            //visitIdentifierExpression - start sh
            edu.pjwstk.kor.model.Shipment _ident_sh1 = _dotEl2;

            if (_ident_sh1 != null) {
                ocb.activate(_ident_sh1, 1);
            }

            //visitIdentifierExpression - end sh
            edu.pjwstk.kor.model.Shipment _dotEl1 = _ident_sh1;

            if (_ident_sh1 != null) {
                ocb.activate(_ident_sh1, 2);
            }

            //visitMethodExpression - start size()
            java.lang.Integer _mth_sizeResult1 = _dotEl1.size();

            if (_mth_sizeResult1 != null) {
                ocb.activate(_mth_sizeResult1, 1);
            }

            //visitMethodExpression - end size()
            //visitDotExpression - end sh.size()
            if (_mth_sizeResult1 != null) {
                ocb.activate(_mth_sizeResult1, 1);
            }

            _dotResult2.add(_mth_sizeResult1);
            _dotIndex2++;
        }

        //visitDotExpression - end (Shipment as sh where sh.size() == 4).sh.size()
        //OperatorCount - start  count((Shipment as sh where sh.size() == 4).sh.size())
        java.lang.Integer _countResult = _dotResult2.size();
        //OperatorCount - end  count((Shipment as sh where sh.size() == 4).sh.size())
        //visitUnaryExpression - end  count((Shipment as sh where sh.size() == 4).sh.size())
        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_countResult, ocb);

        return _countResult;

        //evaluateExpression - end  count((Shipment as sh where sh.size() == 4).sh.size())
    }
}
