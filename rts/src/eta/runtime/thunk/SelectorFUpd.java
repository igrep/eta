package eta.runtime.thunk;

import eta.runtime.stg.StgClosure;
import eta.runtime.stg.StgContext;
import eta.runtime.stg.StgConstr;


public class SelectorFUpd extends SelectorUpd {

    public SelectorFUpd(int i, StgClosure p) {
        super(i, p);
    }

    @Override
    public void selectEnter(StgContext context) {
        context.F(1, ((StgConstr) context.R(1)).getF(index));
    }
}
