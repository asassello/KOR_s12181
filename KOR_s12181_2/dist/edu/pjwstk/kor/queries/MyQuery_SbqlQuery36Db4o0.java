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


public class MyQuery_SbqlQuery36Db4o0 implements Db4oSBQLQuery<java.lang.Double> {
    public MyQuery_SbqlQuery36Db4o0() {
    }

    /**
     * query='dataBase.((0.0 +  count((Payment where getIsDelayed() == true and getIsPaied() == true)))/ ( count((Payment where getIsDelayed() == false and getIsPaied() == true)) +  count((Payment where getIsDelayed() == true and getIsPaied() == true))))'
    '
     **/
    public java.lang.Double executeQuery(final ObjectContainerBase ocb,
        final Transaction t) {
        //evaluateExpression - start (0.0 +  count((Payment where getIsDelayed() == true and getIsPaied() == true)))/ ( count((Payment where getIsDelayed() == false and getIsPaied() == true)) +  count((Payment where getIsDelayed() == true and getIsPaied() == true)))
        final LocalTransaction transLocal = (LocalTransaction) t;

        //visitBinaryAExpression - start (0.0 +  count((Payment where getIsDelayed() == true and getIsPaied() == true)))/ ( count((Payment where getIsDelayed() == false and getIsPaied() == true)) +  count((Payment where getIsDelayed() == true and getIsPaied() == true)))
        //visitBinaryAExpression - start 0.0 +  count((Payment where getIsDelayed() == true and getIsPaied() == true))
        //visitLiteralExpression - start 0.0
        //visitLiteralExpression - end 0.0
        //visitUnaryExpression - start  count((Payment where getIsDelayed() == true and getIsPaied() == true))
        //visitWhereExpression - start Payment where getIsDelayed() == true and getIsPaied() == true
        //visitIdentifierExpression - start Payment
        final java.util.Collection<edu.pjwstk.kor.model.Payment> _ident_Payment = new java.util.ArrayList<edu.pjwstk.kor.model.Payment>();
        ClassMetadata _classMeta50 = ocb.classCollection()
                                        .getClassMetadata("edu.pjwstk.kor.model.Payment");
        long[] _ids50 = _classMeta50.getIDs(transLocal);

        for (long _id50 : _ids50) {
            LazyObjectReference _ref50 = transLocal.lazyReferenceFor((int) _id50);
            _ident_Payment.add((edu.pjwstk.kor.model.Payment) _ref50.getObject());
        }

        //visitIdentifierExpression - end Payment
        java.util.Collection<edu.pjwstk.kor.model.Payment> _whereResult = new java.util.ArrayList<edu.pjwstk.kor.model.Payment>();
        int _whereLoopIndex = 0;

        for (edu.pjwstk.kor.model.Payment _whereEl : _ident_Payment) {
            if (_whereEl == null) {
                continue;
            }

            if (_whereEl != null) {
                ocb.activate(_whereEl, 1);
            }

            //visitBinaryAExpression - start getIsDelayed() == true and getIsPaied() == true
            //OperatorAnd - start getIsDelayed() == true and getIsPaied() == true
            //visitBinaryAExpression - start getIsDelayed() == true
            //visitMethodExpression - start getIsDelayed()
            java.lang.Boolean _mth_getIsDelayedResult = _whereEl.getIsDelayed();

            if (_mth_getIsDelayedResult != null) {
                ocb.activate(_mth_getIsDelayedResult, 1);
            }

            //visitMethodExpression - end getIsDelayed()
            //visitLiteralExpression - start true
            //visitLiteralExpression - end true
            //OperatorEquals - start getIsDelayed() == true
            java.lang.Boolean _equalsResult = OperatorUtils.equalsSafe(_mth_getIsDelayedResult,
                    true);

            //OperatorEquals - end getIsDelayed() == true
            //visitBinaryAExpression - end getIsDelayed() == true
            java.lang.Boolean _andResult;

            if (!_equalsResult) {
                _andResult = false;
            } else {
                //visitBinaryAExpression - start getIsPaied() == true
                //visitMethodExpression - start getIsPaied()
                java.lang.Boolean _mth_getIsPaiedResult = _whereEl.getIsPaied();

                if (_mth_getIsPaiedResult != null) {
                    ocb.activate(_mth_getIsPaiedResult, 1);
                }

                //visitMethodExpression - end getIsPaied()
                //visitLiteralExpression - start true
                //visitLiteralExpression - end true
                //OperatorEquals - start getIsPaied() == true
                java.lang.Boolean _equalsResult1 = OperatorUtils.equalsSafe(_mth_getIsPaiedResult,
                        true);
                //OperatorEquals - end getIsPaied() == true
                //visitBinaryAExpression - end getIsPaied() == true
                _andResult = _equalsResult1;
            }

            //OperatorAnd - end getIsDelayed() == true and getIsPaied() == true
            //visitBinaryAExpression - end getIsDelayed() == true and getIsPaied() == true
            if (_andResult) {
                _whereResult.add(_whereEl);
            }

            _whereLoopIndex++;
        }

        //visitWhereExpression - end Payment where getIsDelayed() == true and getIsPaied() == true
        //OperatorCount - start  count((Payment where getIsDelayed() == true and getIsPaied() == true))
        java.lang.Integer _countResult = _whereResult.size();

        //OperatorCount - end  count((Payment where getIsDelayed() == true and getIsPaied() == true))
        //visitUnaryExpression - end  count((Payment where getIsDelayed() == true and getIsPaied() == true))
        //OperatorPlus - start 0.0 +  count((Payment where getIsDelayed() == true and getIsPaied() == true))
        java.lang.Double _plusResult = 0.0 + _countResult;

        //OperatorPlus - end 0.0 +  count((Payment where getIsDelayed() == true and getIsPaied() == true))
        //visitBinaryAExpression - end 0.0 +  count((Payment where getIsDelayed() == true and getIsPaied() == true))
        //visitBinaryAExpression - start  count((Payment where getIsDelayed() == false and getIsPaied() == true)) +  count((Payment where getIsDelayed() == true and getIsPaied() == true))
        //visitUnaryExpression - start  count((Payment where getIsDelayed() == false and getIsPaied() == true))
        //visitWhereExpression - start Payment where getIsDelayed() == false and getIsPaied() == true
        //visitIdentifierExpression - start Payment
        final java.util.Collection<edu.pjwstk.kor.model.Payment> _ident_Payment1 =
            new java.util.ArrayList<edu.pjwstk.kor.model.Payment>();
        ClassMetadata _classMeta51 = ocb.classCollection()
                                        .getClassMetadata("edu.pjwstk.kor.model.Payment");
        long[] _ids51 = _classMeta51.getIDs(transLocal);

        for (long _id51 : _ids51) {
            LazyObjectReference _ref51 = transLocal.lazyReferenceFor((int) _id51);
            _ident_Payment1.add((edu.pjwstk.kor.model.Payment) _ref51.getObject());
        }

        //visitIdentifierExpression - end Payment
        java.util.Collection<edu.pjwstk.kor.model.Payment> _whereResult1 = new java.util.ArrayList<edu.pjwstk.kor.model.Payment>();
        int _whereLoopIndex1 = 0;

        for (edu.pjwstk.kor.model.Payment _whereEl1 : _ident_Payment1) {
            if (_whereEl1 == null) {
                continue;
            }

            if (_whereEl1 != null) {
                ocb.activate(_whereEl1, 1);
            }

            //visitBinaryAExpression - start getIsDelayed() == false and getIsPaied() == true
            //OperatorAnd - start getIsDelayed() == false and getIsPaied() == true
            //visitBinaryAExpression - start getIsDelayed() == false
            //visitMethodExpression - start getIsDelayed()
            java.lang.Boolean _mth_getIsDelayedResult1 = _whereEl1.getIsDelayed();

            if (_mth_getIsDelayedResult1 != null) {
                ocb.activate(_mth_getIsDelayedResult1, 1);
            }

            //visitMethodExpression - end getIsDelayed()
            //visitLiteralExpression - start false
            //visitLiteralExpression - end false
            //OperatorEquals - start getIsDelayed() == false
            java.lang.Boolean _equalsResult2 = OperatorUtils.equalsSafe(_mth_getIsDelayedResult1,
                    false);

            //OperatorEquals - end getIsDelayed() == false
            //visitBinaryAExpression - end getIsDelayed() == false
            java.lang.Boolean _andResult1;

            if (!_equalsResult2) {
                _andResult1 = false;
            } else {
                //visitBinaryAExpression - start getIsPaied() == true
                //visitMethodExpression - start getIsPaied()
                java.lang.Boolean _mth_getIsPaiedResult1 = _whereEl1.getIsPaied();

                if (_mth_getIsPaiedResult1 != null) {
                    ocb.activate(_mth_getIsPaiedResult1, 1);
                }

                //visitMethodExpression - end getIsPaied()
                //visitLiteralExpression - start true
                //visitLiteralExpression - end true
                //OperatorEquals - start getIsPaied() == true
                java.lang.Boolean _equalsResult3 = OperatorUtils.equalsSafe(_mth_getIsPaiedResult1,
                        true);
                //OperatorEquals - end getIsPaied() == true
                //visitBinaryAExpression - end getIsPaied() == true
                _andResult1 = _equalsResult3;
            }

            //OperatorAnd - end getIsDelayed() == false and getIsPaied() == true
            //visitBinaryAExpression - end getIsDelayed() == false and getIsPaied() == true
            if (_andResult1) {
                _whereResult1.add(_whereEl1);
            }

            _whereLoopIndex1++;
        }

        //visitWhereExpression - end Payment where getIsDelayed() == false and getIsPaied() == true
        //OperatorCount - start  count((Payment where getIsDelayed() == false and getIsPaied() == true))
        java.lang.Integer _countResult1 = _whereResult1.size();

        //OperatorCount - end  count((Payment where getIsDelayed() == false and getIsPaied() == true))
        //visitUnaryExpression - end  count((Payment where getIsDelayed() == false and getIsPaied() == true))
        //visitUnaryExpression - start  count((Payment where getIsDelayed() == true and getIsPaied() == true))
        //visitWhereExpression - start Payment where getIsDelayed() == true and getIsPaied() == true
        //visitIdentifierExpression - start Payment
        final java.util.Collection<edu.pjwstk.kor.model.Payment> _ident_Payment2 =
            new java.util.ArrayList<edu.pjwstk.kor.model.Payment>();
        ClassMetadata _classMeta52 = ocb.classCollection()
                                        .getClassMetadata("edu.pjwstk.kor.model.Payment");
        long[] _ids52 = _classMeta52.getIDs(transLocal);

        for (long _id52 : _ids52) {
            LazyObjectReference _ref52 = transLocal.lazyReferenceFor((int) _id52);
            _ident_Payment2.add((edu.pjwstk.kor.model.Payment) _ref52.getObject());
        }

        //visitIdentifierExpression - end Payment
        java.util.Collection<edu.pjwstk.kor.model.Payment> _whereResult2 = new java.util.ArrayList<edu.pjwstk.kor.model.Payment>();
        int _whereLoopIndex2 = 0;

        for (edu.pjwstk.kor.model.Payment _whereEl2 : _ident_Payment2) {
            if (_whereEl2 == null) {
                continue;
            }

            if (_whereEl2 != null) {
                ocb.activate(_whereEl2, 1);
            }

            //visitBinaryAExpression - start getIsDelayed() == true and getIsPaied() == true
            //OperatorAnd - start getIsDelayed() == true and getIsPaied() == true
            //visitBinaryAExpression - start getIsDelayed() == true
            //visitMethodExpression - start getIsDelayed()
            java.lang.Boolean _mth_getIsDelayedResult2 = _whereEl2.getIsDelayed();

            if (_mth_getIsDelayedResult2 != null) {
                ocb.activate(_mth_getIsDelayedResult2, 1);
            }

            //visitMethodExpression - end getIsDelayed()
            //visitLiteralExpression - start true
            //visitLiteralExpression - end true
            //OperatorEquals - start getIsDelayed() == true
            java.lang.Boolean _equalsResult4 = OperatorUtils.equalsSafe(_mth_getIsDelayedResult2,
                    true);

            //OperatorEquals - end getIsDelayed() == true
            //visitBinaryAExpression - end getIsDelayed() == true
            java.lang.Boolean _andResult2;

            if (!_equalsResult4) {
                _andResult2 = false;
            } else {
                //visitBinaryAExpression - start getIsPaied() == true
                //visitMethodExpression - start getIsPaied()
                java.lang.Boolean _mth_getIsPaiedResult2 = _whereEl2.getIsPaied();

                if (_mth_getIsPaiedResult2 != null) {
                    ocb.activate(_mth_getIsPaiedResult2, 1);
                }

                //visitMethodExpression - end getIsPaied()
                //visitLiteralExpression - start true
                //visitLiteralExpression - end true
                //OperatorEquals - start getIsPaied() == true
                java.lang.Boolean _equalsResult5 = OperatorUtils.equalsSafe(_mth_getIsPaiedResult2,
                        true);
                //OperatorEquals - end getIsPaied() == true
                //visitBinaryAExpression - end getIsPaied() == true
                _andResult2 = _equalsResult5;
            }

            //OperatorAnd - end getIsDelayed() == true and getIsPaied() == true
            //visitBinaryAExpression - end getIsDelayed() == true and getIsPaied() == true
            if (_andResult2) {
                _whereResult2.add(_whereEl2);
            }

            _whereLoopIndex2++;
        }

        //visitWhereExpression - end Payment where getIsDelayed() == true and getIsPaied() == true
        //OperatorCount - start  count((Payment where getIsDelayed() == true and getIsPaied() == true))
        java.lang.Integer _countResult2 = _whereResult2.size();

        //OperatorCount - end  count((Payment where getIsDelayed() == true and getIsPaied() == true))
        //visitUnaryExpression - end  count((Payment where getIsDelayed() == true and getIsPaied() == true))
        //OperatorPlus - start  count((Payment where getIsDelayed() == false and getIsPaied() == true)) +  count((Payment where getIsDelayed() == true and getIsPaied() == true))
        java.lang.Integer _plusResult1 = _countResult1 + _countResult2;

        //OperatorPlus - end  count((Payment where getIsDelayed() == false and getIsPaied() == true)) +  count((Payment where getIsDelayed() == true and getIsPaied() == true))
        //visitBinaryAExpression - end  count((Payment where getIsDelayed() == false and getIsPaied() == true)) +  count((Payment where getIsDelayed() == true and getIsPaied() == true))
        //OperatorDivide - start (0.0 +  count((Payment where getIsDelayed() == true and getIsPaied() == true)))/ ( count((Payment where getIsDelayed() == false and getIsPaied() == true)) +  count((Payment where getIsDelayed() == true and getIsPaied() == true)))
        java.lang.Double _divideResult = _plusResult / _plusResult1;
        //OperatorDivide - end (0.0 +  count((Payment where getIsDelayed() == true and getIsPaied() == true)))/ ( count((Payment where getIsDelayed() == false and getIsPaied() == true)) +  count((Payment where getIsDelayed() == true and getIsPaied() == true)))
        //visitBinaryAExpression - end (0.0 +  count((Payment where getIsDelayed() == true and getIsPaied() == true)))/ ( count((Payment where getIsDelayed() == false and getIsPaied() == true)) +  count((Payment where getIsDelayed() == true and getIsPaied() == true)))
        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_divideResult, ocb);

        return _divideResult;

        //evaluateExpression - end (0.0 +  count((Payment where getIsDelayed() == true and getIsPaied() == true)))/ ( count((Payment where getIsDelayed() == false and getIsPaied() == true)) +  count((Payment where getIsDelayed() == true and getIsPaied() == true)))
    }
}
