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


public class MyQuery_SbqlQuery39Db4o0 implements Db4oSBQLQuery<java.util.Collection<java.lang.String>> {
    public MyQuery_SbqlQuery39Db4o0() {
    }

    /**
     * query='dataBase.( unique Receiver.Adress.getCity() as miasto)'
    '
     **/
    public java.util.Collection<java.lang.String> executeQuery(
        final ObjectContainerBase ocb, final Transaction t) {
        //evaluateExpression - start  unique Receiver.Adress.getCity() as miasto
        final LocalTransaction transLocal = (LocalTransaction) t;

        //visitAsExpression - start  unique Receiver.Adress.getCity() as miasto
        //visitUnaryExpression - start  unique Receiver.Adress.getCity()
        //visitDotExpression - start Receiver.Adress.getCity()
        //visitDotExpression - start Receiver.Adress
        //visitIdentifierExpression - start Receiver
        final java.util.Collection<edu.pjwstk.kor.model.Receiver> _ident_Receiver =
            new java.util.ArrayList<edu.pjwstk.kor.model.Receiver>();
        ClassMetadata _classMeta58 = ocb.classCollection()
                                        .getClassMetadata("edu.pjwstk.kor.model.Receiver");
        long[] _ids58 = _classMeta58.getIDs(transLocal);

        for (long _id58 : _ids58) {
            LazyObjectReference _ref58 = transLocal.lazyReferenceFor((int) _id58);
            _ident_Receiver.add((edu.pjwstk.kor.model.Receiver) _ref58.getObject());
        }

        //visitIdentifierExpression - end Receiver
        java.util.Collection<edu.pjwstk.kor.model.Adress> _dotResult = new java.util.ArrayList<edu.pjwstk.kor.model.Adress>();
        int _dotIndex = 0;

        for (edu.pjwstk.kor.model.Receiver _dotEl : _ident_Receiver) {
            if (_dotEl == null) {
                continue;
            }

            if (_dotEl != null) {
                ocb.activate(_dotEl, 1);
            }

            //visitIdentifierExpression - start Adress
            final java.util.Collection<edu.pjwstk.kor.model.Adress> _ident_Adress =
                new java.util.ArrayList<edu.pjwstk.kor.model.Adress>();
            ClassMetadata _classMeta59 = ocb.classCollection()
                                            .getClassMetadata("edu.pjwstk.kor.model.Adress");
            long[] _ids59 = _classMeta59.getIDs(transLocal);

            for (long _id59 : _ids59) {
                LazyObjectReference _ref59 = transLocal.lazyReferenceFor((int) _id59);
                _ident_Adress.add((edu.pjwstk.kor.model.Adress) _ref59.getObject());
            }

            //visitIdentifierExpression - end Adress
            if (_ident_Adress != null) {
                ocb.activate(_ident_Adress, 2);
            }

            _dotResult.addAll(_ident_Adress);
            _dotIndex++;
        }

        //visitDotExpression - end Receiver.Adress
        java.util.Collection<java.lang.String> _dotResult1 = new java.util.ArrayList<java.lang.String>();
        int _dotIndex1 = 0;

        for (edu.pjwstk.kor.model.Adress _dotEl1 : _dotResult) {
            if (_dotEl1 == null) {
                continue;
            }

            if (_dotEl1 != null) {
                ocb.activate(_dotEl1, 1);
            }

            //visitMethodExpression - start getCity()
            java.lang.String _mth_getCityResult = _dotEl1.getCity();

            if (_mth_getCityResult != null) {
                ocb.activate(_mth_getCityResult, 1);
            }

            //visitMethodExpression - end getCity()
            if (_mth_getCityResult != null) {
                ocb.activate(_mth_getCityResult, 1);
            }

            _dotResult1.add(_mth_getCityResult);
            _dotIndex1++;
        }

        //visitDotExpression - end Receiver.Adress.getCity()
        //OperatorUnique - start  unique Receiver.Adress.getCity()
        java.util.Collection<java.lang.String> _uniqueResult = new java.util.ArrayList<java.lang.String>();
        Set<java.lang.String> _tmp2 = new LinkedHashSet<java.lang.String>();
        _tmp2.addAll(_dotResult1);
        _uniqueResult.addAll(_tmp2);

        //OperatorUnique - end  unique Receiver.Adress.getCity()
        //visitUnaryExpression - end  unique Receiver.Adress.getCity()
        java.util.Collection<java.lang.String> _asResult_miasto = _uniqueResult;
        //visitAsExpression - end  unique Receiver.Adress.getCity() as miasto
        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_asResult_miasto,
            ocb);

        return _asResult_miasto;

        //evaluateExpression - end  unique Receiver.Adress.getCity() as miasto
    }
}
