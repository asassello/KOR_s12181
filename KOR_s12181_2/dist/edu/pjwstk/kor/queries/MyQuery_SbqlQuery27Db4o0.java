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


public class MyQuery_SbqlQuery27Db4o0 implements Db4oSBQLQuery<java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct>> {
    public MyQuery_SbqlQuery27Db4o0() {
    }

    /**
     * query='dataBase.(Shipment as sh where sh.getIsComplaint() == true join sh.getSndr() as sn join sh.getRcvr() as rc).(sh.getSendDate() as DataWyslania, sh.getSndr().getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia, sh.getRcvr().getSurname() as Do)'
    '
     **/
    public java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> executeQuery(
        final ObjectContainerBase ocb, final Transaction t) {
        //evaluateExpression - start (Shipment as sh where sh.getIsComplaint() == true join sh.getSndr() as sn join sh.getRcvr() as rc).(sh.getSendDate() as DataWyslania, sh.getSndr().getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia, sh.getRcvr().getSurname() as Do)
        final LocalTransaction transLocal = (LocalTransaction) t;

        //visitDotExpression - start (Shipment as sh where sh.getIsComplaint() == true join sh.getSndr() as sn join sh.getRcvr() as rc).(sh.getSendDate() as DataWyslania, sh.getSndr().getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia, sh.getRcvr().getSurname() as Do)
        //visitJoinExpression - start Shipment as sh where sh.getIsComplaint() == true join sh.getSndr() as sn join sh.getRcvr() as rc
        //visitJoinExpression - start Shipment as sh where sh.getIsComplaint() == true join sh.getSndr() as sn
        //visitWhereExpression - start Shipment as sh where sh.getIsComplaint() == true
        //visitAsExpression - start Shipment as sh
        //visitIdentifierExpression - start Shipment
        final java.util.Collection<edu.pjwstk.kor.model.Shipment> _ident_Shipment =
            new java.util.ArrayList<edu.pjwstk.kor.model.Shipment>();
        ClassMetadata _classMeta39 = ocb.classCollection()
                                        .getClassMetadata("edu.pjwstk.kor.model.Shipment");
        long[] _ids39 = _classMeta39.getIDs(transLocal);

        for (long _id39 : _ids39) {
            LazyObjectReference _ref39 = transLocal.lazyReferenceFor((int) _id39);
            _ident_Shipment.add((edu.pjwstk.kor.model.Shipment) _ref39.getObject());
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

            //visitBinaryAExpression - start sh.getIsComplaint() == true
            //visitDotExpression - start sh.getIsComplaint()
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

            //visitMethodExpression - start getIsComplaint()
            java.lang.Boolean _mth_getIsComplaintResult = _dotEl.getIsComplaint();

            if (_mth_getIsComplaintResult != null) {
                ocb.activate(_mth_getIsComplaintResult, 1);
            }

            //visitMethodExpression - end getIsComplaint()
            //visitDotExpression - end sh.getIsComplaint()
            //visitLiteralExpression - start true
            //visitLiteralExpression - end true
            //OperatorEquals - start sh.getIsComplaint() == true
            java.lang.Boolean _equalsResult = OperatorUtils.equalsSafe(_mth_getIsComplaintResult,
                    true);

            //OperatorEquals - end sh.getIsComplaint() == true
            //visitBinaryAExpression - end sh.getIsComplaint() == true
            if (_equalsResult) {
                _whereResult.add(_whereEl);
            }

            _whereLoopIndex++;
        }

        //visitWhereExpression - end Shipment as sh where sh.getIsComplaint() == true
        java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _joinResult =
            new java.util.ArrayList<pl.wcislo.sbql4j.java.model.runtime.Struct>();
        int _joinIndex = 0;

        for (edu.pjwstk.kor.model.Shipment _joinEl : _whereResult) {
            if (_joinEl != null) {
                ocb.activate(_joinEl, 1);
            }

            //visitAsExpression - start sh.getSndr() as sn
            //visitDotExpression - start sh.getSndr()
            //visitIdentifierExpression - start sh
            edu.pjwstk.kor.model.Shipment _ident_sh1 = _joinEl;

            if (_ident_sh1 != null) {
                ocb.activate(_ident_sh1, 1);
            }

            //visitIdentifierExpression - end sh
            edu.pjwstk.kor.model.Shipment _dotEl1 = _ident_sh1;

            if (_ident_sh1 != null) {
                ocb.activate(_ident_sh1, 2);
            }

            //visitMethodExpression - start getSndr()
            edu.pjwstk.kor.model.Sender _mth_getSndrResult = _dotEl1.getSndr();

            if (_mth_getSndrResult != null) {
                ocb.activate(_mth_getSndrResult, 1);
            }

            //visitMethodExpression - end getSndr()
            //visitDotExpression - end sh.getSndr()
            edu.pjwstk.kor.model.Sender _asResult_sn = _mth_getSndrResult;
            //visitAsExpression - end sh.getSndr() as sn
            _joinResult.add(OperatorUtils.cartesianProductSS(_joinEl,
                    _asResult_sn, "sh", "sn"));
            _joinIndex++;
        }

        //visitJoinExpression - end Shipment as sh where sh.getIsComplaint() == true join sh.getSndr() as sn
        java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _joinResult1 =
            new java.util.ArrayList<pl.wcislo.sbql4j.java.model.runtime.Struct>();
        int _joinIndex1 = 0;

        for (pl.wcislo.sbql4j.java.model.runtime.Struct _joinEl1 : _joinResult) {
            if (_joinEl1 != null) {
                ocb.activate(_joinEl1, 1);
            }

            //visitAsExpression - start sh.getRcvr() as rc
            //visitDotExpression - start sh.getRcvr()
            //visitIdentifierExpression - start sh
            edu.pjwstk.kor.model.Shipment _ident_sh2 = (edu.pjwstk.kor.model.Shipment) _joinEl1.get(
                    "sh");

            if (_ident_sh2 != null) {
                ocb.activate(_ident_sh2, 1);
            }

            //visitIdentifierExpression - end sh
            edu.pjwstk.kor.model.Shipment _dotEl2 = _ident_sh2;

            if (_ident_sh2 != null) {
                ocb.activate(_ident_sh2, 2);
            }

            //visitMethodExpression - start getRcvr()
            edu.pjwstk.kor.model.Receiver _mth_getRcvrResult = _dotEl2.getRcvr();

            if (_mth_getRcvrResult != null) {
                ocb.activate(_mth_getRcvrResult, 1);
            }

            //visitMethodExpression - end getRcvr()
            //visitDotExpression - end sh.getRcvr()
            edu.pjwstk.kor.model.Receiver _asResult_rc = _mth_getRcvrResult;
            //visitAsExpression - end sh.getRcvr() as rc
            _joinResult1.add(OperatorUtils.cartesianProductSS(_joinEl1,
                    _asResult_rc, "", "rc"));
            _joinIndex1++;
        }

        //visitJoinExpression - end Shipment as sh where sh.getIsComplaint() == true join sh.getSndr() as sn join sh.getRcvr() as rc
        java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _dotResult9 =
            new java.util.ArrayList<pl.wcislo.sbql4j.java.model.runtime.Struct>();
        int _dotIndex9 = 0;

        for (pl.wcislo.sbql4j.java.model.runtime.Struct _dotEl9 : _joinResult1) {
            if (_dotEl9 == null) {
                continue;
            }

            if (_dotEl9 != null) {
                ocb.activate(_dotEl9, 2);
            }

            //visitCommaExpression - start sh.getSendDate() as DataWyslania, sh.getSndr().getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia, sh.getRcvr().getSurname() as Do
            //visitCommaExpression - start sh.getSendDate() as DataWyslania, sh.getSndr().getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia
            //visitCommaExpression - start sh.getSendDate() as DataWyslania, sh.getSndr().getSurname() as Od
            //visitAsExpression - start sh.getSendDate() as DataWyslania
            //visitDotExpression - start sh.getSendDate()
            //visitIdentifierExpression - start sh
            edu.pjwstk.kor.model.Shipment _ident_sh3 = (edu.pjwstk.kor.model.Shipment) _dotEl9.get(
                    "sh");

            if (_ident_sh3 != null) {
                ocb.activate(_ident_sh3, 1);
            }

            //visitIdentifierExpression - end sh
            edu.pjwstk.kor.model.Shipment _dotEl3 = _ident_sh3;

            if (_ident_sh3 != null) {
                ocb.activate(_ident_sh3, 2);
            }

            //visitMethodExpression - start getSendDate()
            java.util.Date _mth_getSendDateResult = _dotEl3.getSendDate();

            if (_mth_getSendDateResult != null) {
                ocb.activate(_mth_getSendDateResult, 1);
            }

            //visitMethodExpression - end getSendDate()
            //visitDotExpression - end sh.getSendDate()
            java.util.Date _asResult_DataWyslania = _mth_getSendDateResult;

            //visitAsExpression - end sh.getSendDate() as DataWyslania
            //visitAsExpression - start sh.getSndr().getSurname() as Od
            //visitDotExpression - start sh.getSndr().getSurname()
            //visitDotExpression - start sh.getSndr()
            //visitIdentifierExpression - start sh
            edu.pjwstk.kor.model.Shipment _ident_sh4 = (edu.pjwstk.kor.model.Shipment) _dotEl9.get(
                    "sh");

            if (_ident_sh4 != null) {
                ocb.activate(_ident_sh4, 1);
            }

            //visitIdentifierExpression - end sh
            edu.pjwstk.kor.model.Shipment _dotEl4 = _ident_sh4;

            if (_ident_sh4 != null) {
                ocb.activate(_ident_sh4, 2);
            }

            //visitMethodExpression - start getSndr()
            edu.pjwstk.kor.model.Sender _mth_getSndrResult1 = _dotEl4.getSndr();

            if (_mth_getSndrResult1 != null) {
                ocb.activate(_mth_getSndrResult1, 1);
            }

            //visitMethodExpression - end getSndr()
            //visitDotExpression - end sh.getSndr()
            edu.pjwstk.kor.model.Sender _dotEl5 = _mth_getSndrResult1;

            if (_mth_getSndrResult1 != null) {
                ocb.activate(_mth_getSndrResult1, 2);
            }

            //visitMethodExpression - start getSurname()
            java.lang.String _mth_getSurnameResult = _dotEl5.getSurname();

            if (_mth_getSurnameResult != null) {
                ocb.activate(_mth_getSurnameResult, 1);
            }

            //visitMethodExpression - end getSurname()
            //visitDotExpression - end sh.getSndr().getSurname()
            java.lang.String _asResult_Od = _mth_getSurnameResult;

            //visitAsExpression - end sh.getSndr().getSurname() as Od
            //OperatorComma - start sh.getSendDate() as DataWyslania, sh.getSndr().getSurname() as Od
            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult = OperatorUtils.cartesianProductSS(_asResult_DataWyslania,
                    _asResult_Od, "DataWyslania", "Od");

            //OperatorComma - end sh.getSendDate() as DataWyslania, sh.getSndr().getSurname() as Od
            //visitCommaExpression - end sh.getSendDate() as DataWyslania, sh.getSndr().getSurname() as Od
            //visitAsExpression - start sh.getDeliveredDate() as DataDostarczenia
            //visitDotExpression - start sh.getDeliveredDate()
            //visitIdentifierExpression - start sh
            edu.pjwstk.kor.model.Shipment _ident_sh5 = (edu.pjwstk.kor.model.Shipment) _dotEl9.get(
                    "sh");

            if (_ident_sh5 != null) {
                ocb.activate(_ident_sh5, 1);
            }

            //visitIdentifierExpression - end sh
            edu.pjwstk.kor.model.Shipment _dotEl6 = _ident_sh5;

            if (_ident_sh5 != null) {
                ocb.activate(_ident_sh5, 2);
            }

            //visitMethodExpression - start getDeliveredDate()
            java.util.Date _mth_getDeliveredDateResult = _dotEl6.getDeliveredDate();

            if (_mth_getDeliveredDateResult != null) {
                ocb.activate(_mth_getDeliveredDateResult, 1);
            }

            //visitMethodExpression - end getDeliveredDate()
            //visitDotExpression - end sh.getDeliveredDate()
            java.util.Date _asResult_DataDostarczenia = _mth_getDeliveredDateResult;

            //visitAsExpression - end sh.getDeliveredDate() as DataDostarczenia
            //OperatorComma - start sh.getSendDate() as DataWyslania, sh.getSndr().getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia
            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult1 = OperatorUtils.cartesianProductSS(_commaResult,
                    _asResult_DataDostarczenia, "", "DataDostarczenia");

            //OperatorComma - end sh.getSendDate() as DataWyslania, sh.getSndr().getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia
            //visitCommaExpression - end sh.getSendDate() as DataWyslania, sh.getSndr().getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia
            //visitAsExpression - start sh.getRcvr().getSurname() as Do
            //visitDotExpression - start sh.getRcvr().getSurname()
            //visitDotExpression - start sh.getRcvr()
            //visitIdentifierExpression - start sh
            edu.pjwstk.kor.model.Shipment _ident_sh6 = (edu.pjwstk.kor.model.Shipment) _dotEl9.get(
                    "sh");

            if (_ident_sh6 != null) {
                ocb.activate(_ident_sh6, 1);
            }

            //visitIdentifierExpression - end sh
            edu.pjwstk.kor.model.Shipment _dotEl7 = _ident_sh6;

            if (_ident_sh6 != null) {
                ocb.activate(_ident_sh6, 2);
            }

            //visitMethodExpression - start getRcvr()
            edu.pjwstk.kor.model.Receiver _mth_getRcvrResult1 = _dotEl7.getRcvr();

            if (_mth_getRcvrResult1 != null) {
                ocb.activate(_mth_getRcvrResult1, 1);
            }

            //visitMethodExpression - end getRcvr()
            //visitDotExpression - end sh.getRcvr()
            edu.pjwstk.kor.model.Receiver _dotEl8 = _mth_getRcvrResult1;

            if (_mth_getRcvrResult1 != null) {
                ocb.activate(_mth_getRcvrResult1, 2);
            }

            //visitMethodExpression - start getSurname()
            java.lang.String _mth_getSurnameResult1 = _dotEl8.getSurname();

            if (_mth_getSurnameResult1 != null) {
                ocb.activate(_mth_getSurnameResult1, 1);
            }

            //visitMethodExpression - end getSurname()
            //visitDotExpression - end sh.getRcvr().getSurname()
            java.lang.String _asResult_Do = _mth_getSurnameResult1;

            //visitAsExpression - end sh.getRcvr().getSurname() as Do
            //OperatorComma - start sh.getSendDate() as DataWyslania, sh.getSndr().getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia, sh.getRcvr().getSurname() as Do
            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult2 = OperatorUtils.cartesianProductSS(_commaResult1,
                    _asResult_Do, "", "Do");

            //OperatorComma - end sh.getSendDate() as DataWyslania, sh.getSndr().getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia, sh.getRcvr().getSurname() as Do
            //visitCommaExpression - end sh.getSendDate() as DataWyslania, sh.getSndr().getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia, sh.getRcvr().getSurname() as Do
            if (_commaResult2 != null) {
                ocb.activate(_commaResult2, 2);
            }

            _dotResult9.add(_commaResult2);
            _dotIndex9++;
        }

        //visitDotExpression - end (Shipment as sh where sh.getIsComplaint() == true join sh.getSndr() as sn join sh.getRcvr() as rc).(sh.getSendDate() as DataWyslania, sh.getSndr().getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia, sh.getRcvr().getSurname() as Do)
        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_dotResult9, ocb);

        return _dotResult9;

        //evaluateExpression - end (Shipment as sh where sh.getIsComplaint() == true join sh.getSndr() as sn join sh.getRcvr() as rc).(sh.getSendDate() as DataWyslania, sh.getSndr().getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia, sh.getRcvr().getSurname() as Do)
    }
}
