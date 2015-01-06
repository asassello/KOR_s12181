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


public class MyQuery_SbqlQuery3Db4o0 implements Db4oSBQLQuery<java.lang.Double> {
    public MyQuery_SbqlQuery3Db4o0() {
    }

    /**
     * query='dataBase.( avg(Packagement.getWeight()))'
    '
     **/
    public java.lang.Double executeQuery(final ObjectContainerBase ocb,
        final Transaction t) {
        //evaluateExpression - start  avg(Packagement.getWeight())
        final LocalTransaction transLocal = (LocalTransaction) t;

        //visitUnaryExpression - start  avg(Packagement.getWeight())
        //visitDotExpression - start Packagement.getWeight()
        //visitIdentifierExpression - start Packagement
        final java.util.Collection<edu.pjwstk.kor.model.Packagement> _ident_Packagement =
            new java.util.ArrayList<edu.pjwstk.kor.model.Packagement>();
        ClassMetadata _classMeta3 = ocb.classCollection()
                                       .getClassMetadata("edu.pjwstk.kor.model.Packagement");
        long[] _ids3 = _classMeta3.getIDs(transLocal);

        for (long _id3 : _ids3) {
            LazyObjectReference _ref3 = transLocal.lazyReferenceFor((int) _id3);
            _ident_Packagement.add((edu.pjwstk.kor.model.Packagement) _ref3.getObject());
        }

        //visitIdentifierExpression - end Packagement
        java.util.Collection<java.lang.Double> _dotResult = new java.util.ArrayList<java.lang.Double>();
        int _dotIndex = 0;

        for (edu.pjwstk.kor.model.Packagement _dotEl : _ident_Packagement) {
            if (_dotEl == null) {
                continue;
            }

            if (_dotEl != null) {
                ocb.activate(_dotEl, 1);
            }

            //visitMethodExpression - start getWeight()
            java.lang.Double _mth_getWeightResult = _dotEl.getWeight();

            if (_mth_getWeightResult != null) {
                ocb.activate(_mth_getWeightResult, 1);
            }

            //visitMethodExpression - end getWeight()
            if (_mth_getWeightResult != null) {
                ocb.activate(_mth_getWeightResult, 1);
            }

            _dotResult.add(_mth_getWeightResult);
            _dotIndex++;
        }

        //visitDotExpression - end Packagement.getWeight()
        //OperatorAvg - start  avg(Packagement.getWeight())
        java.lang.Double _avgResult = 0d;

        if ((_dotResult != null) && !_dotResult.isEmpty()) {
            Number _avgSum0 = null;

            for (Number _avgEl0 : _dotResult) {
                _avgSum0 = MathUtils.sum(_avgSum0, _avgEl0);
            }

            _avgResult = _avgSum0.doubleValue() / _dotResult.size();
        }

        //OperatorAvg - end  avg(Packagement.getWeight())
        //visitUnaryExpression - end  avg(Packagement.getWeight())
        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_avgResult, ocb);

        return _avgResult;

        //evaluateExpression - end  avg(Packagement.getWeight())
    }
}
