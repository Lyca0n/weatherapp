import * as constants from '../config/constants';

const batchUpdateReducerDefaultState = {
  entity: {},
  entities: [],
  loading: false
};

export default (state = batchUpdateReducerDefaultState, action) => {
  switch (action.type) {
    case constants.ADD_BATCH_UPDATE:
      return {
        ...state,
        entity: action.payload.data
      };
    case constants.ADD_BATCH_UPDATES:
        return {
          ...state,
          entities: action.payload.data.updates
      }
    //return state.filter(({ id }) => id !== action.id);    
    default:
      return state;
  }
};
