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


public class MyQuery_SbqlQuery23Db4o0 implements Db4oSBQLQuery<java.util.Collection<edu.pjwstk.kor.model.Shipment>> {
    public MyQuery_SbqlQuery23Db4o0() {
    }

    /**
     * query='dataBase.(Shipment as sh where sh.getIsLost() == true)'
    '
     **/
    public java.util.Collection<edu.pjwstk.kor.model.Shipment> executeQuery(
        final ObjectContainerBase ocb, final Transaction t) {
        //evaluateExpression - start Shipment as sh where sh.getIsLost() == true
        final LocalTransaction transLocal = (LocalTransaction) t;

        //visitWhereExpression - start Shipment as sh where sh.getIsLost() == true
        //visitAsExpression - start Shipment as sh
        //visitIdentifierExpression - start Shipment
        final java.util.Collection<edu.pjwstk.kor.model.Shipment> _ident_Shipment =
            new java.util.ArrayList<edu.pjwstk.kor.model.Shipment>();
        ClassMetadata _classMeta34 = ocb.classCollection()
                                        .getClassMetadata("edu.pjwstk.kor.model.Shipment");
        long[] _ids34 = _classMeta34.getIDs(transLocal);

        for (long _id34 : _ids34) {
            LazyObjectReference _ref34 = transLocal.lazyReferenceFor((int) _id34);
            _ident_Shipment.add((edu.pjwstk.kor.model.Shipment) _ref34.getObject());
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

            //visitBinaryAExpression - start sh.getIsLost() == true
            //visitDotExpression - start sh.getIsLost()
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

            //visitMethodExpression - start getIsLost()
            java.lang.Boolean _mth_getIsLostResult = _dotEl.getIsLost();

            if (_mth_getIsLostResult != null) {
                ocb.activate(_mth_getIsLostResult, 1);
            }

            //visitMethodExpression - end getIsLost()
            //visitDotExpression - end sh.getIsLost()
            //visitLiteralExpression - start true
            //visitLiteralExpression - end true
            //OperatorEquals - start sh.getIsLost() == true
            java.lang.Boolean _equalsResult = OperatorUtils.equalsSafe(_mth_getIsLostResult,
                    true);

            //OperatorEquals - end sh.getIsLost() == true
            //visitBinaryAExpression - end sh.getIsLost() == true
            if (_equalsResult) {
                _whereResult.add(_whereEl);
            }

            _whereLoopIndex++;
        }

        //visitWhereExpression - end Shipment as sh where sh.getIsLost() == true
        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_whereResult, ocb);

        return _whereResult;

        //evaluateExpression - end Shipment as sh where sh.getIsLost() == true
    }
}
