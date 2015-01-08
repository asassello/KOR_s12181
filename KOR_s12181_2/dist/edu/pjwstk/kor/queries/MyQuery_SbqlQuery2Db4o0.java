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


public class MyQuery_SbqlQuery2Db4o0 implements Db4oSBQLQuery<java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct>> {
    public MyQuery_SbqlQuery2Db4o0() {
    }

    /**
     * query='dataBase.(Receiver as rc group as _aux0).((Sender as sn group as _aux1).(Shipment as sh where sh.getIsComplaint() == true join _aux1) join _aux0).(sh.getSendDate() as DataWyslania, sn.getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia, rc.getSurname() as Do)'
    '
     **/
    public java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> executeQuery(
        final ObjectContainerBase ocb, final Transaction t) {
        //evaluateExpression - start (Receiver as rc group as _aux0).((Sender as sn group as _aux1).(Shipment as sh where sh.getIsComplaint() == true join _aux1) join _aux0).(sh.getSendDate() as DataWyslania, sn.getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia, rc.getSurname() as Do)
        final LocalTransaction transLocal = (LocalTransaction) t;

        //visitDotExpression - start (Receiver as rc group as _aux0).((Sender as sn group as _aux1).(Shipment as sh where sh.getIsComplaint() == true join _aux1) join _aux0).(sh.getSendDate() as DataWyslania, sn.getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia, rc.getSurname() as Do)
        //visitDotExpression - start (Receiver as rc group as _aux0).((Sender as sn group as _aux1).(Shipment as sh where sh.getIsComplaint() == true join _aux1) join _aux0)
        //visitGroupAsExpression - start Receiver as rc group as _aux0
        //visitAsExpression - start Receiver as rc
        //visitIdentifierExpression - start Receiver
        final java.util.Collection<edu.pjwstk.kor.model.Receiver> _ident_Receiver =
            new java.util.ArrayList<edu.pjwstk.kor.model.Receiver>();
        ClassMetadata _classMeta3 = ocb.classCollection()
                                       .getClassMetadata("edu.pjwstk.kor.model.Receiver");
        long[] _ids3 = _classMeta3.getIDs(transLocal);

        for (long _id3 : _ids3) {
            LazyObjectReference _ref3 = transLocal.lazyReferenceFor((int) _id3);
            _ident_Receiver.add((edu.pjwstk.kor.model.Receiver) _ref3.getObject());
        }

        //visitIdentifierExpression - end Receiver
        java.util.Collection<edu.pjwstk.kor.model.Receiver> _asResult_rc = _ident_Receiver;

        //visitAsExpression - end Receiver as rc
        java.util.Collection<edu.pjwstk.kor.model.Receiver> _groupAsResult_aux0 = _asResult_rc;

        //visitGroupAsExpression - end Receiver as rc group as _aux0
        java.util.Collection<edu.pjwstk.kor.model.Receiver> _dotEl2 = _groupAsResult_aux0;

        //visitJoinExpression - start (Sender as sn group as _aux1).(Shipment as sh where sh.getIsComplaint() == true join _aux1) join _aux0
        //visitDotExpression - start (Sender as sn group as _aux1).(Shipment as sh where sh.getIsComplaint() == true join _aux1)
        //visitGroupAsExpression - start Sender as sn group as _aux1
        //visitAsExpression - start Sender as sn
        //visitIdentifierExpression - start Sender
        final java.util.Collection<edu.pjwstk.kor.model.Sender> _ident_Sender = new java.util.ArrayList<edu.pjwstk.kor.model.Sender>();
        ClassMetadata _classMeta4 = ocb.classCollection()
                                       .getClassMetadata("edu.pjwstk.kor.model.Sender");
        long[] _ids4 = _classMeta4.getIDs(transLocal);

        for (long _id4 : _ids4) {
            LazyObjectReference _ref4 = transLocal.lazyReferenceFor((int) _id4);
            _ident_Sender.add((edu.pjwstk.kor.model.Sender) _ref4.getObject());
        }

        //visitIdentifierExpression - end Sender
        java.util.Collection<edu.pjwstk.kor.model.Sender> _asResult_sn = _ident_Sender;

        //visitAsExpression - end Sender as sn
        java.util.Collection<edu.pjwstk.kor.model.Sender> _groupAsResult_aux1 = _asResult_sn;

        //visitGroupAsExpression - end Sender as sn group as _aux1
        java.util.Collection<edu.pjwstk.kor.model.Sender> _dotEl1 = _groupAsResult_aux1;

        //visitJoinExpression - start Shipment as sh where sh.getIsComplaint() == true join _aux1
        //visitWhereExpression - start Shipment as sh where sh.getIsComplaint() == true
        //visitAsExpression - start Shipment as sh
        //visitIdentifierExpression - start Shipment
        final java.util.Collection<edu.pjwstk.kor.model.Shipment> _ident_Shipment =
            new java.util.ArrayList<edu.pjwstk.kor.model.Shipment>();
        ClassMetadata _classMeta5 = ocb.classCollection()
                                       .getClassMetadata("edu.pjwstk.kor.model.Shipment");
        long[] _ids5 = _classMeta5.getIDs(transLocal);

        for (long _id5 : _ids5) {
            LazyObjectReference _ref5 = transLocal.lazyReferenceFor((int) _id5);
            _ident_Shipment.add((edu.pjwstk.kor.model.Shipment) _ref5.getObject());
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

            //visitIdentifierExpression - start _aux1
            java.util.Collection<edu.pjwstk.kor.model.Sender> _ident__aux1 = _dotEl1;

            if (_ident__aux1 != null) {
                ocb.activate(_ident__aux1, 2);
            }

            //visitIdentifierExpression - end _aux1
            _joinResult.addAll(OperatorUtils.cartesianProductSC(_joinEl,
                    _ident__aux1, "sh", "sn"));
            _joinIndex++;
        }

        //visitJoinExpression - end Shipment as sh where sh.getIsComplaint() == true join _aux1
        //visitDotExpression - end (Sender as sn group as _aux1).(Shipment as sh where sh.getIsComplaint() == true join _aux1)
        java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _joinResult1 =
            new java.util.ArrayList<pl.wcislo.sbql4j.java.model.runtime.Struct>();
        int _joinIndex1 = 0;

        for (pl.wcislo.sbql4j.java.model.runtime.Struct _joinEl1 : _joinResult) {
            if (_joinEl1 != null) {
                ocb.activate(_joinEl1, 1);
            }

            //visitIdentifierExpression - start _aux0
            java.util.Collection<edu.pjwstk.kor.model.Receiver> _ident__aux0 = _dotEl2;

            if (_ident__aux0 != null) {
                ocb.activate(_ident__aux0, 2);
            }

            //visitIdentifierExpression - end _aux0
            _joinResult1.addAll(OperatorUtils.cartesianProductSC(_joinEl1,
                    _ident__aux0, "", "rc"));
            _joinIndex1++;
        }

        //visitJoinExpression - end (Sender as sn group as _aux1).(Shipment as sh where sh.getIsComplaint() == true join _aux1) join _aux0
        //visitDotExpression - end (Receiver as rc group as _aux0).((Sender as sn group as _aux1).(Shipment as sh where sh.getIsComplaint() == true join _aux1) join _aux0)
        java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _dotResult7 =
            new java.util.ArrayList<pl.wcislo.sbql4j.java.model.runtime.Struct>();
        int _dotIndex7 = 0;

        for (pl.wcislo.sbql4j.java.model.runtime.Struct _dotEl7 : _joinResult1) {
            if (_dotEl7 == null) {
                continue;
            }

            if (_dotEl7 != null) {
                ocb.activate(_dotEl7, 2);
            }

            //visitCommaExpression - start sh.getSendDate() as DataWyslania, sn.getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia, rc.getSurname() as Do
            //visitCommaExpression - start sh.getSendDate() as DataWyslania, sn.getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia
            //visitCommaExpression - start sh.getSendDate() as DataWyslania, sn.getSurname() as Od
            //visitAsExpression - start sh.getSendDate() as DataWyslania
            //visitDotExpression - start sh.getSendDate()
            //visitIdentifierExpression - start sh
            edu.pjwstk.kor.model.Shipment _ident_sh1 = (edu.pjwstk.kor.model.Shipment) _dotEl7.get(
                    "sh");

            if (_ident_sh1 != null) {
                ocb.activate(_ident_sh1, 1);
            }

            //visitIdentifierExpression - end sh
            edu.pjwstk.kor.model.Shipment _dotEl3 = _ident_sh1;

            if (_ident_sh1 != null) {
                ocb.activate(_ident_sh1, 2);
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
            //visitAsExpression - start sn.getSurname() as Od
            //visitDotExpression - start sn.getSurname()
            //visitIdentifierExpression - start sn
            edu.pjwstk.kor.model.Sender _ident_sn = (edu.pjwstk.kor.model.Sender) _dotEl7.get(
                    "sn");

            if (_ident_sn != null) {
                ocb.activate(_ident_sn, 1);
            }

            //visitIdentifierExpression - end sn
            edu.pjwstk.kor.model.Sender _dotEl4 = _ident_sn;

            if (_ident_sn != null) {
                ocb.activate(_ident_sn, 2);
            }

            //visitMethodExpression - start getSurname()
            java.lang.String _mth_getSurnameResult = _dotEl4.getSurname();

            if (_mth_getSurnameResult != null) {
                ocb.activate(_mth_getSurnameResult, 1);
            }

            //visitMethodExpression - end getSurname()
            //visitDotExpression - end sn.getSurname()
            java.lang.String _asResult_Od = _mth_getSurnameResult;

            //visitAsExpression - end sn.getSurname() as Od
            //OperatorComma - start sh.getSendDate() as DataWyslania, sn.getSurname() as Od
            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult = OperatorUtils.cartesianProductSS(_asResult_DataWyslania,
                    _asResult_Od, "DataWyslania", "Od");

            //OperatorComma - end sh.getSendDate() as DataWyslania, sn.getSurname() as Od
            //visitCommaExpression - end sh.getSendDate() as DataWyslania, sn.getSurname() as Od
            //visitAsExpression - start sh.getDeliveredDate() as DataDostarczenia
            //visitDotExpression - start sh.getDeliveredDate()
            //visitIdentifierExpression - start sh
            edu.pjwstk.kor.model.Shipment _ident_sh2 = (edu.pjwstk.kor.model.Shipment) _dotEl7.get(
                    "sh");

            if (_ident_sh2 != null) {
                ocb.activate(_ident_sh2, 1);
            }

            //visitIdentifierExpression - end sh
            edu.pjwstk.kor.model.Shipment _dotEl5 = _ident_sh2;

            if (_ident_sh2 != null) {
                ocb.activate(_ident_sh2, 2);
            }

            //visitMethodExpression - start getDeliveredDate()
            java.util.Date _mth_getDeliveredDateResult = _dotEl5.getDeliveredDate();

            if (_mth_getDeliveredDateResult != null) {
                ocb.activate(_mth_getDeliveredDateResult, 1);
            }

            //visitMethodExpression - end getDeliveredDate()
            //visitDotExpression - end sh.getDeliveredDate()
            java.util.Date _asResult_DataDostarczenia = _mth_getDeliveredDateResult;

            //visitAsExpression - end sh.getDeliveredDate() as DataDostarczenia
            //OperatorComma - start sh.getSendDate() as DataWyslania, sn.getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia
            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult1 = OperatorUtils.cartesianProductSS(_commaResult,
                    _asResult_DataDostarczenia, "", "DataDostarczenia");

            //OperatorComma - end sh.getSendDate() as DataWyslania, sn.getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia
            //visitCommaExpression - end sh.getSendDate() as DataWyslania, sn.getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia
            //visitAsExpression - start rc.getSurname() as Do
            //visitDotExpression - start rc.getSurname()
            //visitIdentifierExpression - start rc
            edu.pjwstk.kor.model.Receiver _ident_rc = (edu.pjwstk.kor.model.Receiver) _dotEl7.get(
                    "rc");

            if (_ident_rc != null) {
                ocb.activate(_ident_rc, 1);
            }

            //visitIdentifierExpression - end rc
            edu.pjwstk.kor.model.Receiver _dotEl6 = _ident_rc;

            if (_ident_rc != null) {
                ocb.activate(_ident_rc, 2);
            }

            //visitMethodExpression - start getSurname()
            java.lang.String _mth_getSurnameResult1 = _dotEl6.getSurname();

            if (_mth_getSurnameResult1 != null) {
                ocb.activate(_mth_getSurnameResult1, 1);
            }

            //visitMethodExpression - end getSurname()
            //visitDotExpression - end rc.getSurname()
            java.lang.String _asResult_Do = _mth_getSurnameResult1;

            //visitAsExpression - end rc.getSurname() as Do
            //OperatorComma - start sh.getSendDate() as DataWyslania, sn.getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia, rc.getSurname() as Do
            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult2 = OperatorUtils.cartesianProductSS(_commaResult1,
                    _asResult_Do, "", "Do");

            //OperatorComma - end sh.getSendDate() as DataWyslania, sn.getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia, rc.getSurname() as Do
            //visitCommaExpression - end sh.getSendDate() as DataWyslania, sn.getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia, rc.getSurname() as Do
            if (_commaResult2 != null) {
                ocb.activate(_commaResult2, 2);
            }

            _dotResult7.add(_commaResult2);
            _dotIndex7++;
        }

        //visitDotExpression - end (Receiver as rc group as _aux0).((Sender as sn group as _aux1).(Shipment as sh where sh.getIsComplaint() == true join _aux1) join _aux0).(sh.getSendDate() as DataWyslania, sn.getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia, rc.getSurname() as Do)
        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_dotResult7, ocb);

        return _dotResult7;

        //evaluateExpression - end (Receiver as rc group as _aux0).((Sender as sn group as _aux1).(Shipment as sh where sh.getIsComplaint() == true join _aux1) join _aux0).(sh.getSendDate() as DataWyslania, sn.getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia, rc.getSurname() as Do)
    }
}
