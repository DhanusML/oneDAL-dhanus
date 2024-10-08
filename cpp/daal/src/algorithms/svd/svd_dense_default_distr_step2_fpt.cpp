/* file: svd_dense_default_distr_step2_fpt.cpp */
/*******************************************************************************
* Copyright 2014 Intel Corporation
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*******************************************************************************/

/*
//++
//  Implementation of svd algorithm and types methods.
//--
*/

#include "src/algorithms/svd/svd_dense_default_distr_step2.h"
namespace daal
{
namespace algorithms
{
namespace svd
{
namespace interface1
{
template services::Status DistributedPartialResult::allocate<DAAL_FPTYPE>(const daal::algorithms::Input * input,
                                                                          const daal::algorithms::Parameter * parameter, const int method);
template services::Status DistributedPartialResult::setPartialResultStorage<DAAL_FPTYPE>(data_management::KeyValueDataCollection * inCollection,
                                                                                         size_t & nBlocks);

} // namespace interface1
} // namespace svd
} // namespace algorithms
} // namespace daal
