import storesReducer from './store';
import updateDetailReducer from './update_detail';
import batchUpdateReducer from './batch_update';
import storeErrorReducer from './store_error';
import { combineReducers }  from 'redux';

const reducers = combineReducers({
  store: storesReducer,
  batchUpdate: batchUpdateReducer,
  updateDetail: updateDetailReducer,
  storeError: storeErrorReducer
})

export default reducers;