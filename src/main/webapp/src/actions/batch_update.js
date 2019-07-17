import * as constants from '../config/constants';
import axios from 'axios';

export const fetchAll = () => {
  const url = constants.API+'updates';
  return (dispatch, getState) =>{
    axios.get(url).then((data)=>{
      dispatch(addBatchUpdates(data));
    })
  }
}

export const addBatchUpdates = (updates) =>{
  return {
    type: constants.ADD_BATCH_UPDATES,
    payload: updates
  }
}