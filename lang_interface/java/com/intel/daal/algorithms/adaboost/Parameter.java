/* file: Parameter.java */
/*******************************************************************************
* Copyright 2014-2019 Intel Corporation
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

/**
 * @defgroup adaboost Adaboost Classifier
 * @brief Contains classes for the AdaBoost classification algorithm
 * @ingroup boosting
 */
/**
 * @brief Contains classes for the AdaBoost classification algorithm
 */
package com.intel.daal.algorithms.adaboost;

import com.intel.daal.services.DaalContext;
import com.intel.daal.algorithms.classifier.training.TrainingBatch;
import com.intel.daal.algorithms.classifier.prediction.PredictionBatch;

/**
 * <a name="DAAL-CLASS-ALGORITHMS__ADABOOST__PARAMETER"></a>
 * @brief AdaBoost algorithm parameters
 */
public class Parameter extends com.intel.daal.algorithms.classifier.Parameter {
    public Parameter(DaalContext context, long cParameter) {
        super(context, cParameter);
    }

    /**
     * Sets the algorithm for weak learner model training
     * @param weakLearnerTraining Algorithm for weak learner model training
     */
    public void setWeakLearnerTraining(TrainingBatch weakLearnerTraining) {
        cSetWeakLearnerTraining(this.cObject, weakLearnerTraining.cObject);
    }

    /**
     * Sets the algorithm for prediction based on a weak learner model
     * @param weakLearnerPrediction Algorithm for prediction based on a weak learner model
     */
    public void setWeakLearnerPrediction(PredictionBatch weakLearnerPrediction) {
        cSetWeakLearnerPrediction(this.cObject, weakLearnerPrediction.cObject);
    }

    /**
     * Sets the accuracy of the AdaBoost training algorithm
     * @param accuracyThreshold Accuracy of the AdaBoost training algorithm
     */
    public void setAccuracyThreshold(double accuracyThreshold) {
        cSetAccuracyThreshold(this.cObject, accuracyThreshold);
    }

    /**
     * Retrieves the accuracy of the AdaBoost training algorithm
     * @return Accuracy of the AdaBoost training algorithm
     */
    public double getAccuracyThreshold() {
        return cGetAccuracyThreshold(this.cObject);
    }

    /**
     * Sets the maximal number of iterations for the AdaBoost training algorithm
     * @param maxIterations Maximal number of iterations
     */
    public void setMaxIterations(long maxIterations) {
        cSetMaxIterations(this.cObject, maxIterations);
    }

    /**
     * Retrieves the maximal number of iterations for the AdaBoost training algorithm
     * @return Maximal number of iterations
     */
    public long getMaxIterations() {
        return cGetMaxIterations(this.cObject);
    }

    /**
     * Sets the learning rate of the AdaBoost training algorithm
     * @param learningRate The learning rate of the AdaBoost training algorithm
     */
    public void setLearningRate(double learningRate) {
        cSetLearningRate(this.cObject, learningRate);
    }

    /**
     * Retrieves the accuracy of the AdaBoost training algorithm
     * @return Accuracy of the AdaBoost training algorithm
     */
    public double getLearningRate() {
        return cGetLearningRate(this.cObject);
    }

    private native void cSetWeakLearnerTraining(long selfPtr, long trainerAddr);
    private native void cSetWeakLearnerPrediction(long selfPtr, long predictorAddr);

    private native double cGetAccuracyThreshold(long selfPtr);
    private native void cSetAccuracyThreshold(long selfPtr, double accuracyThreshold);

    private native long cGetMaxIterations(long selfPtr);
    private native void cSetMaxIterations(long selfPtr, long maxIterations);

    private native double cGetLearningRate(long selfPtr);
    private native void cSetLearningRate(long selfPtr, double learningRate);
}
/** @} */
