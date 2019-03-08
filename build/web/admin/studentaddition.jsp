<%-- 
    Document   : studentaddition
    Created on : Mar 4, 2019, 3:51:16 PM
    Author     : Daksh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="adminhome.jsp" %>
<html>
    <head>
        <title>Add Student | Admin</title>

        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath }/temp/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath }/css/custom.css">
        <script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>

        <!-- Custom fonts for this template -->
        <link href="${pageContext.request.contextPath }/temp/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="${pageContext.request.contextPath }/temp/https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
        <link href="${pageContext.request.contextPath }/temp/https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">

        <!-- Plugin CSS -->
        <link href="${pageContext.request.contextPath }/temp/vendor/magnific-popup/magnific-popup.css" rel="stylesheet" type="text/css">

        <!-- Custom styles for this template -->
        <link href="${pageContext.request.contextPath }/temp/css/freelancer.min.css" rel="stylesheet">
    </head>	
    <script>
        $(function () {
            $("#DOJ").datepicker({
                changeMonth: true,
                changeYear: true,
                yearRange: '1992:2018',
                dateFormat: 'yy-mm-dd'

            });
        });
    </script>	
    <body>

        <form id="uploadimage" action="" method="post" enctype="multipart/form-data">

            <div class='container' style="border-width: 95%">
                <div class='row'>
                    <div class='col-sm-0 col-md-2 col-lg-2 col-xs-0'>
                    </div>
                    <div class='col-sm-12 col-md-8 col-lg-8 col-xs-12' style="background: #669999;color:#FFFFFF;"align="center">
                        <h3>Student Profile Creation</h3>
                    </div>
                </div>
                
                <div class='row'>
                    
                    <div class='col-sm-0 col-md-2 col-lg-2 col-xs-0'>
                        <br>
                    </div>
                    <div class='col-sm-12 col-md-8 col-lg-8 col-xs-12' style="background: #eee !important;">
                        <div class='col-sm-12 col-md-6 col-lg-6 col-xs-12' style='padding:0px 2px;'>
                            <div class="row">
                                
                                <div class='col-sm-9 col-md-9 col-lg-9 col-xs-8' style='float:left;' >
                                    <label for="usr">Roll Number</label><div id="ErrorFacultyID" style ="color:red"></div>
                                    <input type='hidden' name='PAGENAV' id='PAGENAV' value='EDIT'/>
                                    <input class='form-control Inactive' type='text' style='width:100%;' id='' title='enter username' placeholder="Enter Roll number" />					
                                    <label for="usr" >Gender</label>
                                    <div class="col-sm-12 col-md-12 col-lg-12 col-xs-12" style='float:left;background: #ffffff !important;padding-top:0px; border-radius:5px' id="ErrorGender">

                                        <div class="radio">
                                            <input type="radio" style= "opacity: 0" name="Gender" id="Gender" value ="NON" checked/>
                                            <label >
                                                <input  type='radio' name='Gender' id='Gender1' value ='M' onchange='valid(Gender1)' checked/>							Male
                                            </label>
                                            <label style="margin-left:10px;">
                                                <input type='radio' name='Gender' id='Gender2' value ='F' onchange='valid(Gender2)'/>							Female
                                            </label>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <label for="usr">Upload <span style = "color:red";>JPEG Image (Max Size:50 kb)</span></label><div id="Errorfile" style ="color:red"></div>
                            <!---<input input type="file" accept="image/*" name="file" onchange="loadFile(event)" id= "file"  />-->
                            <input class='form-control' type="file" name="file" id="file" value="Upload IMG" onchange="valid(file);"/>
                            <label for="usr">Name</label>
                            <!-- <div id="ErrorSalutation" style="color:red;" ></div>
                            <div id="ErrorFacultyName" style="color:red;" ></div> -->
                            <div class="row">
                                <div class="col-sm-4 col-md-4 col-lg-4 col-xs-4" style="padding-right:2px">
                                    <select class='form-control' type="select" name="Salutation" id="Salutation" onchange="valid(Salutation);"  >
                                        <option value = "0" selected>Salutation</option>
                                        <option value="Mr">Mr</option>
                                        <option value="Ms">Ms</option>					
                                    </select>	
                                </div>	
                                <div class="col-sm-8 col-md-8 col-lg-8 col-xs-8" style="padding-left:2px">
                                    <input class='form-control Inactive' type='text' id='' title='enter username' placeholder='Enter Name'>
                                </div>
                            </div>
                            <div class="row" >

                                <div class='col-sm-6 col-md-6 col-lg-6 col-xs-6' style='padding-right:2px;'>
                                    <label for="usr">Father's Name</label><div id="ErrorFatherName" style ="color:red"></div>
                                    <div class="input-group" >
                                        <span class="input-group-addon" style="padding:5px;">Sh</span> 
                                        <input class='form-control' style="padding:5px;" type="text" name="FatherName" id="FatherName" placeholder='Enter Father Name' onchange="valid(FatherName)" >
                                    </div>
                                </div>
                                <div class='col-sm-6 col-md-6 col-lg-6 col-xs-6' style='padding-left:2px'>
                                    <label for="usr">Mobile Number</label><div id="ErrorMobileNumber" style ="color:red" ></div>
                                    <input class='form-control' type="text" name="MobileNumber" id="MobileNumber" onchange="valid(MobileNumber)" placeholder='10 Digit Mb No'>
                                </div>
                            </div>
                            <div class="row">
                                <div class='col-sm-6 col-md-6 col-lg-6 col-xs-6' style='padding-right:2px'>
                                    <label for="usr">Date of Birth</label><div id="ErrorDOB" style ="color:red"></div>
                                    <input class='form-control' type="date" name="DOB" id="DOB" onchange="valid(DOB)" title='enter username' placeholder='input text' value='0000-00-00' />
                                </div>
                                <div class='col-sm-6 col-md-6 col-lg-6 col-xs-6' style='padding-left:2px'>
                                    <label for="usr">Mother's Name</label><div id="ErrorMotherName" style ="color:red"></div>
                                    <div class="input-group">
                                        <span class="input-group-addon" style="padding:5px;">Smt</span>
                                        <input class='form-control' style="padding:5px;" type="text" name="MotherName" id="MotherName" onchange="valid(MotherName)";"disable(MotherName)" title='enter username' placeholder='Enter Mother Name' value='' />
                                    </div>
                                </div>

                            </div>
                            <div class="row">
                                <div class='col-sm-6 col-md-6 col-lg-6 col-xs-6' style='padding-right:2px'>
                                    <label for="usr">AADHAR Number</label><div id="AadharNumber" style ="color:red"></div>
                                    <input class='form-control' type="text" id="AadharNumber" onchange="valid(AadharNumber)" placeholder='Enter AADHAR Number' />
                                </div>
                                <div class='col-sm-6 col-md-6 col-lg-6 col-xs-6' style='padding-left:2px'>
                                    <label for="usr">PAN Number</label><div id="ErrorPanNumber" style ="color:red"></div>
                                    <input class='form-control' type="text" name="PanNumber" id="PanNumber" onchange="valid(PanNumber)" title='Enter PAN Number' placeholder='Enter PAN Number' />
                                </div>
                            </div>
                            <br>
                            <br>
                        </div>

                        <div class='col-sm-12 col-md-6 col-lg-6 col-xs-12'>
                            <label style="float:left;">Email ID</label><div id="ErrorEmail" style ="color:red" ></div>
                            <input class='form-control' type="email" name="Email" id="Email" onchange="valid(Email)" placeholder="Enter Personal Email ID" >
                           
                            <div class="row">
                                <div class='col-sm-6 col-md-6 col-lg-6 col-xs-6' style='padding-right:2px'>
                                    <label for="usr">University</label><div id="ErrorUID" style ="color:red"></div>	
                                    <select class='form-control Inactive' style="padding:5px;" type="select" name="UID" id="UID" onchange="GetUidReg(); valid(UID);" >
                                        <option value="0" selected>Select University</option>
                                        <option value = "1">M M (Deemed to be University), Mullana</option>
                                        <option value="2">M M University, Sadopur</option>
                                        <option value="3">M M University, Solan</option>
                                    </select>
                                </div>
                                <div class='col-sm-6 col-md-6 col-lg-6 col-xs-6' style='padding-left:2px'>
                                    <label for="usr">Institute</label><div id="ErrorIID" style ="color:red"></div>
                                    <select class='form-control Inactive' style="padding:5px;" type="select" name="IID" id="IID" onchange="GetIidReg();valid(IID);" >
                                        <option value="0" selected>Select Institute</option>
                                        <option value = "1" >M M Engineering College</option><option value="2">Dental College</option><option value="3">Medical College</option><option value="4">M M Institute of Management</option><option value="5">MCA College</option><option value="6">LAW College</option><option value="7">Hotel Management College</option><option value="8">Physiotherapy College</option><option value="9">College of Nursing</option><option value="10">Inst. of Nursing</option><option value="11">Pharmacy College</option>					</select>
                                </div>
                            </div>
                            <div class="row">
                                <div class='col-sm-12 col-md-12 col-lg-12 col-xs-12'>
                                    <label for="usr">Department</label><div id="ErrorDID" style ="color:red"></div>
                                    <select class='form-control Inactive' style="padding:5px;" type="select" name="DID" id="DID" onchange="valid(DID);">
                                        <option value="0" selected>Select Department</option>
                                        <option value="1">Mechanical Engineering</option><option value="2">Mechatronics Engineering</option><option value="3">Civil Engineering</option><option value="4">Electrical Engineering</option><option value = "5" >Computer SC & Engineering</option><option value="6">Humanities</option><option value="7">Physics</option><option value="8">Chemistry</option><option value="9">Mathematics</option><option value="10">Electronics Engineering</option><option value="11">Biotech Engineering</option>					</select>
                                </div>
                                <!-- <div class='col-sm-6 col-md-6 col-lg-6 col-xs-6' style='padding-left:2px'>			
                                        <label>Designation</label><div id="ErrorDesignation" style ="color:red"></div>
                                        <select class='form-control'  style="padding:5px;" type="select" name="Designation" id="Designation" onchange="valid(Designation)" >
                                                <option value = "0" selected>Designation</option><option value="Professor">Professor</option><option value = "AssociateProfessor">Associate Professor</option><option value="Reader">Reader</option><option value="AssistantProfessor">Assistant Professor</option><option value="Lecturer">Lecturer</option><option value="Tutor">Tutor</option>					</select>
                                </div> -->	
                            </div>		
                            <div class="row">
                                <div class='col-sm-6 col-md-6 col-lg-6 col-xs-6' style='padding-right:2px'>
                                    <label>Date of Joining</label><div id="ErrorDOJ" style ="color:red"></div>
                                    <input class='form-control ' type="text" name="DOJ" id="DOJ" onchange="valid(DOJ)" placeholder='Select Joining Date'>
                                </div>
                                <div class='col-sm-6 col-md-6 col-lg-6 col-xs-6' style='padding-left:2px'>
                                    <label for="usr">Highest Qualification</label><div id="ErrorQualification" style ="color:red"></div>
                                    <select class='form-control'  type="select" name="Qualification" id="Qualification" onchange="valid(Qualification);">
                                        <option value = "0" selected>Qualification</option><option value="Graduation">Graduation</option><option value="PostGraduation">Post Graduation</option>
                                    </select>
                                </div>
                            </div>
                            <label for="usr">Country (Hometown)</label><div id="ErrorCountryID" style ="color:red"></div>	
                            <select class='form-control' type="select" name="CountryID" id="CountryID" onchange="GetCountry(); valid(CountryID);" >
                                <option value="0" selected>Select Country you belong to:</option> 
                                <option value="0">Select Country</option><option value="1">Afghanistan</option><option value="2">Albania</option><option value="3">Algeria</option><option value="4">American Samoa</option><option value="5">Andorra</option><option value="6">Angola</option><option value="7">Anguilla</option><option value="8">Antarctica</option><option value="9">Antigua And Barbuda</option><option value="10">Argentina</option><option value="11">Armenia</option><option value="12">Aruba</option><option value="13">Australia</option><option value="14">Austria</option><option value="15">Azerbaijan</option><option value="16">Bahamas The</option><option value="17">Bahrain</option><option value="18">Bangladesh</option><option value="19">Barbados</option><option value="20">Belarus</option><option value="21">Belgium</option><option value="22">Belize</option><option value="23">Benin</option><option value="24">Bermuda</option><option value="25">Bhutan</option><option value="26">Bolivia</option><option value="27">Bosnia and Herzegovina</option><option value="28">Botswana</option><option value="29">Bouvet Island</option><option value="30">Brazil</option><option value="31">British Indian Ocean Territory</option><option value="32">Brunei</option><option value="33">Bulgaria</option><option value="34">Burkina Faso</option><option value="35">Burundi</option><option value="36">Cambodia</option><option value="37">Cameroon</option><option value="38">Canada</option><option value="39">Cape Verde</option><option value="40">Cayman Islands</option><option value="41">Central African Republic</option><option value="42">Chad</option><option value="43">Chile</option><option value="44">China</option><option value="45">Christmas Island</option><option value="46">Cocos (Keeling) Islands</option><option value="47">Colombia</option><option value="48">Comoros</option><option value="49">Congo</option><option value="50">Congo The Democratic Republic Of The</option><option value="51">Cook Islands</option><option value="52">Costa Rica</option><option value="53">Cote D'Ivoire (Ivory Coast)</option><option value="54">Croatia (Hrvatska)</option><option value="55">Cuba</option><option value="56">Cyprus</option><option value="57">Czech Republic</option><option value="58">Denmark</option><option value="59">Djibouti</option><option value="60">Dominica</option><option value="61">Dominican Republic</option><option value="62">East Timor</option><option value="63">Ecuador</option><option value="64">Egypt</option><option value="65">El Salvador</option><option value="66">Equatorial Guinea</option><option value="67">Eritrea</option>
                                <option value="68">Estonia</option><option value="69">Ethiopia</option><option value="70">External Territories of Australia</option><option value="71">Falkland Islands</option><option value="72">Faroe Islands</option><option value="73">Fiji Islands</option><option value="74">Finland</option><option value="75">France</option><option value="76">French Guiana</option><option value="77">French Polynesia</option><option value="78">French Southern Territories</option><option value="79">Gabon</option><option value="80">Gambia The</option><option value="81">Georgia</option><option value="82">Germany</option><option value="83">Ghana</option><option value="84">Gibraltar</option><option value="85">Greece</option><option value="86">Greenland</option><option value="87">Grenada</option><option value="88">Guadeloupe</option><option value="89">Guam</option><option value="90">Guatemala</option><option value="91">Guernsey and Alderney</option><option value="92">Guinea</option><option value="93">Guinea-Bissau</option><option value="94">Guyana</option><option value="95">Haiti</option><option value="96">Heard and McDonald Islands</option><option value="97">Honduras</option><option value="98">Hong Kong S.A.R.</option><option value="99">Hungary</option><option value="100">Iceland</option><option value = "101" >India</option><option value="102">Indonesia</option><option value="103">Iran</option><option value="104">Iraq</option><option value="105">Ireland</option><option value="106">Israel</option><option value="107">Italy</option><option value="108">Jamaica</option><option value="109">Japan</option><option value="110">Jersey</option><option value="111">Jordan</option>
                                <option value="112">Kazakhstan</option><option value="113">Kenya</option><option value="114">Kiribati</option><option value="115">Korea North</option><option value="116">Korea South</option><option value="117">Kuwait</option><option value="118">Kyrgyzstan</option><option value="119">Laos</option><option value="120">Latvia</option><option value="121">Lebanon</option><option value="122">Lesotho</option><option value="123">Liberia</option><option value="124">Libya</option><option value="125">Liechtenstein</option><option value="126">Lithuania</option><option value="127">Luxembourg</option><option value="128">Macau S.A.R.</option><option value="129">Macedonia</option><option value="130">Madagascar</option><option value="131">Malawi</option><option value="132">Malaysia</option><option value="133">Maldives</option><option value="134">Mali</option><option value="135">Malta</option><option value="136">Man (Isle of)</option><option value="137">Marshall Islands</option><option value="138">Martinique</option><option value="139">Mauritania</option><option value="140">Mauritius</option><option value="141">Mayotte</option><option value="142">Mexico</option><option value="143">Micronesia</option><option value="144">Moldova</option><option value="145">Monaco</option><option value="146">Mongolia</option><option value="147">Montserrat</option><option value="148">Morocco</option><option value="149">Mozambique</option><option value="150">Myanmar</option><option value="151">Namibia</option><option value="152">Nauru</option><option value="153">Nepal</option><option value="154">Netherlands Antilles</option><option value="155">Netherlands The</option><option value="156">New Caledonia</option><option value="157">New Zealand</option><option value="158">Nicaragua</option><option value="159">Niger</option><option value="160">Nigeria</option><option value="161">Niue</option><option value="162">Norfolk Island</option><option value="163">Northern Mariana Islands</option><option value="164">Norway</option><option value="165">Oman</option><option value="166">Pakistan</option><option value="167">Palau</option><option value="168">Palestinian Territory Occupied</option><option value="169">Panama</option><option value="170">Papua new Guinea</option><option value="171">Paraguay</option><option value="172">Peru</option><option value="173">Philippines</option><option value="174">Pitcairn Island</option><option value="175">Poland</option><option value="176">Portugal</option><option value="177">Puerto Rico</option><option value="178">Qatar</option><option value="179">Reunion</option><option value="180">Romania</option>
                                <option value="181">Russia</option><option value="182">Rwanda</option><option value="183">Saint Helena</option>
                                <option value="184">Saint Kitts And Nevis</option><option value="185">Saint Lucia</option><option value="186">Saint Pierre and Miquelon</option><option value="187">Saint Vincent And The Grenadines</option><option value="188">Samoa</option><option value="189">San Marino</option><option value="190">Sao Tome and Principe</option><option value="191">Saudi Arabia</option><option value="192">Senegal</option><option value="193">Serbia</option><option value="194">Seychelles</option><option value="195">Sierra Leone</option><option value="196">Singapore</option><option value="197">Slovakia</option><option value="198">Slovenia</option><option value="199">Smaller Territories of the UK</option><option value="200">Solomon Islands</option><option value="201">Somalia</option><option value="202">South Africa</option><option value="203">South Georgia</option><option value="204">South Sudan</option><option value="205">Spain</option><option value="206">Sri Lanka</option><option value="207">Sudan</option><option value="208">Suriname</option><option value="209">Svalbard And Jan Mayen Islands</option><option value="210">Swaziland</option><option value="211">Sweden</option><option value="212">Switzerland</option><option value="213">Syria</option><option value="214">Taiwan</option><option value="215">Tajikistan</option><option value="216">Tanzania</option><option value="217">Thailand</option><option value="218">Togo</option><option value="219">Tokelau</option><option value="220">Tonga</option><option value="221">Trinidad And Tobago</option><option value="222">Tunisia</option><option value="223">Turkey</option><option value="224">Turkmenistan</option><option value="225">Turks And Caicos Islands</option><option value="226">Tuvalu</option><option value="227">Uganda</option><option value="228">Ukraine</option><option value="229">United Arab Emirates</option><option value="230">United Kingdom</option><option value="231">United States</option><option value="232">United States Minor Outlying Islands</option><option value="233">Uruguay</option><option value="234">Uzbekistan</option><option value="235">Vanuatu</option><option value="236">Vatican City State (Holy See)</option><option value="237">Venezuela</option><option value="238">Vietnam</option><option value="239">Virgin Islands (British)</option><option value="240">Virgin Islands (US)</option><option value="241">Wallis And Futuna Islands</option><option value="242">Western Sahara</option><option value="243">Yemen</option><option value="244">Yugoslavia</option><option value="245">Zambia</option><option value="246">Zimbabwe</option>			
                            </select>
                            <div class="row">
                                <div class='col-sm-6 col-md-6 col-lg-6 col-xs-6' style='padding-right:2px'>
                                    <label for="usr">State (Hometown)</label><div id="ErrorStateID" style ="color:red"></div>
                                    <select class='form-control' type="select" name="StateID" id="StateID" onchange="GetState();valid(StateID);" >
                                        <option value="0" selected>Select State you belong to:</option>
                                        <option value="0">Select State</option><option value="1">Andaman and Nicobar Islands</option><option value="2">Andhra Pradesh</option><option value="3">Arunachal Pradesh</option><option value="4">Assam</option><option value="5">Bihar</option><option value="6">Chandigarh</option><option value="7">Chhattisgarh</option><option value="8">Dadra and Nagar Haveli</option><option value="9">Daman and Diu</option><option value="10">Delhi</option><option value="11">Goa</option><option value="12">Gujarat</option><option value = "13">Haryana</option><option value="14">Himachal Pradesh</option><option value="15">Jammu and Kashmir</option><option value="16">Jharkhand</option><option value="17">Karnataka</option><option value="18">Kenmore</option><option value="19">Kerala</option><option value="20">Lakshadweep</option><option value="21">Madhya Pradesh</option><option value="22">Maharashtra</option><option value="23">Manipur</option><option value="24">Meghalaya</option><option value="25">Mizoram</option><option value="26">Nagaland</option><option value="27">Narora</option><option value="28">Natwar</option><option value="29">Odisha</option><option value="30">Paschim Medinipur</option><option value="31">Pondicherry</option><option value="32">Punjab</option><option value="33">Rajasthan</option><option value="34">Sikkim</option><option value="35">Tamil Nadu</option><option value="36">Telangana</option><option value="37">Tripura</option><option value="38">Uttar Pradesh</option><option value="39">Uttarakhand</option><option value="40">Vaishali</option><option value="41">West Bengal</option>					</select>
                                </div>
                                <div class='col-sm-6 col-md-6 col-lg-6 col-xs-6' style='padding-left:2px'>
                                    <label for="usr">District/City (Hometown)</label><div id="ErrorCityID" style ="color:red"></div>
                                    <select class='form-control' type="select" name="CityID" id="CityID" onchange="valid(CityID);">
                                        <option value="0" selected>Select District</option>
                                        <option value="0">Select City</option><option value = "185">Ambala</option><option value="186">Bhiwani</option><option value="187">Charkhi Dadri</option>
                                        <option value="188">Faridabad</option><option value="189">Fatehabad</option><option value="190">Gurugram</option><option value="191">Hisar</option><option value="192">Jhajjar</option>
                                        <option value="193">Jind</option><option value="194">Kaithal</option><option value="195">Karnal</option><option value="196">Kurukshetra</option><option value="197">Mahendragarh</option><option value="198">Mewat</option>
                                        <option value="199">Palwal</option><option value="200">Panchkula</option><option value="201">Panipat</option><option value="202">Rewari</option><option value="203">Rohtak</option><option value="204">Sirsa</option>
                                        <option value="205">Sonipat</option><option value="206">Yamunanagar</option>
                                    </select>
                                </div>
                            </div>
                            <label for="usr">Research Area</label><div id="ErrorAreaInt" style ="color:red"></div>
                            <textarea class='form-control' rows="1" name="AreaInt" id="AreaInt" ></textarea>

                            <button class='btn btn-primary' style="width:100%; margin-top:10px;" id="popup1" class="submit" data-toggle='modal' data-target='#myModal'>Preview</button>

                        </div>

                    </div>	
                </div>	

                <hr>
                <div class="row">
                    <div class="col-sm-12">

                    </div>
                </div>

            </div>
            
                <div color="cyan">
                   
                </div>
            
        </form>
        <div id="myModal" class="modal fade" role="dialog">
            <div class="modal-dialog" >

                <!-- Modal content-->
                <div class="modal-content"style="background: #eee;" >
                    <div class="modal-body" id="abc"></div>
                    <!--<div  id='AJPreviewID'></div>
                    <div class="modal-body" id='AJSubmitMsgID'></div>-->
                </div>

            </div>
        </div>
 <%@include file="footer.jsp" %>
    </body>
</html>