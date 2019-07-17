import * as constants from '../config/constants';

const updateDetailReducerDefaultState ={
    entity:{},
    entities:[],
    loading:false
};

export default (state = updateDetailReducerDefaultState, action) => {
    switch (action.type) {
        case constants.ADD_UPDATE_DETAIL:
            return {...state, 
                    entity: action.payload.data};
        case constants.ADD_UPDATE_DETAILS:
            return {
              ...state,
              entities: action.payload.data
            }            
        default:
            return state;
    }
};
